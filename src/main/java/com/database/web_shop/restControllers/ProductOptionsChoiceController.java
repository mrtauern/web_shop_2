package com.database.web_shop.restControllers;

import com.database.web_shop.models.ProductOptionsChoice;
import com.database.web_shop.services.ProductOptionsChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class ProductOptionsChoiceController {
    public ProductOptionsChoiceController() {

    }

    Logger log = Logger.getLogger(ProductOptionsChoiceController.class.getName());

    @Autowired
    ProductOptionsChoiceService productOptionsChoiceService;

    @GetMapping("/productoptionschoice")
    public ResponseEntity<List<ProductOptionsChoice>> allProductOptionsChoice(){
        try {
            List<ProductOptionsChoice> productOptionsChoices = productOptionsChoiceService.findAll();
            if (productOptionsChoices.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(productOptionsChoices, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/productoptionschoice/{id}")
    public ResponseEntity<ProductOptionsChoice> oneProductOptionsChoice(@PathVariable int id){
        try {
            return new ResponseEntity<>(productOptionsChoiceService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/productoptionschoice")
    @ResponseBody
    public ResponseEntity<ProductOptionsChoice> addProductOptionsChoice(@RequestBody ProductOptionsChoice productOptionsChoices){
        log.info(productOptionsChoices.toString());
        try {
            return new ResponseEntity<>(productOptionsChoiceService.save(productOptionsChoices), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/productoptionschoice/{id}")
    public ResponseEntity<ProductOptionsChoice> editProductOptionsChoice(@RequestBody ProductOptionsChoice productOptionsChoices, @PathVariable int id){
        try {
            ProductOptionsChoice _productOptionsChoices = productOptionsChoiceService.findById(id);
            productOptionsChoices.setId(_productOptionsChoices.getId());
            return new ResponseEntity<>(productOptionsChoiceService.save(productOptionsChoices), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/productoptionschoice/{id}")
    public ResponseEntity<?> deleteProductOptionsChoice(@PathVariable int id){
        try {
            productOptionsChoiceService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
