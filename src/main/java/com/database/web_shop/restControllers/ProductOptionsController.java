package com.database.web_shop.restControllers;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.ProductOptions;
import com.database.web_shop.services.CreditCardsService;
import com.database.web_shop.services.ProductOptionsService;
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
public class ProductOptionsController {

    public ProductOptionsController(){

    }

    Logger log = Logger.getLogger(ProductOptionsController.class.getName());

    @Autowired
    ProductOptionsService productOptionsService;

    @GetMapping("/productOptions")
    public ResponseEntity<List<ProductOptions>> allProductOptions(){
        try {
            List<ProductOptions> productOptions = productOptionsService.findAll();
            if (productOptions.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(productOptions, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/productOption/{id}")
    public ResponseEntity<ProductOptions> oneProductOption(@PathVariable int id){
        try {
            return new ResponseEntity<>(productOptionsService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/productOption")
    @ResponseBody
    public ResponseEntity<ProductOptions> addProductOption(@RequestBody ProductOptions productOptions){
        log.info(productOptions.toString());
        /*user.setCountry(countriesService.findById(58L));
        user.setOrders(null);
        user.setReviews(null);*/
        try {
            return new ResponseEntity<>(productOptionsService.save(productOptions), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/productOption/{id}")
    public ResponseEntity<ProductOptions> editProductOption(@RequestBody ProductOptions productOptions, @PathVariable int id){
        try {
            ProductOptions _productOptions = productOptionsService.findById(id);
            productOptions.setId(_productOptions.getId());
            return new ResponseEntity<>(productOptionsService.save(productOptions), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/productOption/{id}")
    public ResponseEntity<?> deleteProductOption(@PathVariable int id){
        try {
            productOptionsService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
