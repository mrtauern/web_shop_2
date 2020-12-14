package com.database.web_shop.restControllers;

import com.database.web_shop.models.ProductsCategories;
import com.database.web_shop.services.ProductsCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class ProductsCategoriesController {


    public ProductsCategoriesController(){

    }
    Logger log = Logger.getLogger(ProductsCategoriesController.class.getName());

    @Autowired
    ProductsCategoriesService productsCategoriesService;

    @GetMapping("/productsCategories")
    public ResponseEntity<List<ProductsCategories>> allProductsCategories(){
        try {
            List<ProductsCategories> productsCategories = productsCategoriesService.findAll();
            if (productsCategories.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(productsCategories, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/productsCategories")
    @ResponseBody
    public ResponseEntity<ProductsCategories> addProductsCategories (@RequestBody ProductsCategories productsCategories){
        log.info(productsCategories.toString());
        try {
            return new ResponseEntity<>(productsCategoriesService.save(productsCategories), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/productsCategories")
    public ResponseEntity<?> deleteProductsCategories(@RequestBody ProductsCategories productsCategories){
        try {
            productsCategoriesService.delete(productsCategories);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
