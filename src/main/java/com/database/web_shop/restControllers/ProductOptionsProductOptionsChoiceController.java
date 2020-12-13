package com.database.web_shop.restControllers;

import com.database.web_shop.models.ProductOptions;
import com.database.web_shop.models.ProductOptionsProductOptionsChoice;
import com.database.web_shop.services.ProductOptionsProductOptionsChoiceService;
import com.database.web_shop.services.ProductOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class ProductOptionsProductOptionsChoiceController {

    public ProductOptionsProductOptionsChoiceController(){

    }

    Logger log = Logger.getLogger(ProductOptionsProductOptionsChoiceController.class.getName());

    @Autowired
    ProductOptionsProductOptionsChoiceService productOptionsProductOptionsChoiceService;

    @GetMapping("/productOptionsProductOptionsChoices")
    public ResponseEntity<List<ProductOptionsProductOptionsChoice>> allProductOptionsProductOptionsChoices(){
        try {
            List<ProductOptionsProductOptionsChoice> productOptionsProductOptionsChoices = productOptionsProductOptionsChoiceService.findAll();
            if (productOptionsProductOptionsChoices.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(productOptionsProductOptionsChoices, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/productOptionsProductOptionsChoice/{id}")
    public ResponseEntity<ProductOptionsProductOptionsChoice> oneProductOptionsProductOptionsChoice(@PathVariable int id){
        try {
            return new ResponseEntity<>(productOptionsProductOptionsChoiceService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/productOptionsProductOptionsChoice")
    @ResponseBody
    public ResponseEntity<ProductOptionsProductOptionsChoice> addProductOptionsProductOptionsChoice(@RequestBody ProductOptionsProductOptionsChoice productOptionsProductOptionsChoice){
        log.info(productOptionsProductOptionsChoice.toString());
        /*user.setCountry(countriesService.findById(58L));
        user.setOrders(null);
        user.setReviews(null);*/
        try {
            return new ResponseEntity<>(productOptionsProductOptionsChoiceService.save(productOptionsProductOptionsChoice), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/productOptionsProductOptionsChoice/{id}")
    public ResponseEntity<?> deleteProductOptionsProductOptionsChoice(@PathVariable int id){
        try {
            productOptionsProductOptionsChoiceService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
