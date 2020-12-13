package com.database.web_shop.restControllers;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.Users;
import com.database.web_shop.services.CreditCardsService;
import com.database.web_shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class CreditCardsController {

    public CreditCardsController(){

    }

    Logger log = Logger.getLogger(CreditCardsController.class.getName());

    @Qualifier("CreditCardsService")
    @Autowired
    CreditCardsService creditCardsService;

    @GetMapping("/creditCards")
    public ResponseEntity<List<CreditCards>> allCreditCards(){
        try {
            List<CreditCards> creditCards = creditCardsService.findAll();
            if (creditCards.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(creditCards, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/creditCard/{id}")
    public ResponseEntity<CreditCards> oneCreditCard(@PathVariable int id){
        try {
            return new ResponseEntity<>(creditCardsService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/creditCard")
    @ResponseBody
    public ResponseEntity<CreditCards> addCreditCard(@RequestBody CreditCards creditCards){
        log.info(creditCards.toString());
        /*user.setCountry(countriesService.findById(58L));
        user.setOrders(null);
        user.setReviews(null);*/
        try {
            return new ResponseEntity<>(creditCardsService.save(creditCards), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/creditCard/{id}")
    public ResponseEntity<CreditCards> editCreditCard(@RequestBody CreditCards creditCards, @PathVariable int id){
        try {
            CreditCards _creditCards = creditCardsService.findById(id);
            creditCards.setId(_creditCards.getId());
            return new ResponseEntity<>(creditCardsService.save(creditCards), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/creditCard/{id}")
    public ResponseEntity<?> deleteCreditCard(@PathVariable int id){
        try {
            creditCardsService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
