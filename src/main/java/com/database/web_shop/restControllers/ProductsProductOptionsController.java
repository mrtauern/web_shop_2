package com.database.web_shop.restControllers;

import com.database.web_shop.models.ProductsCategories;
import com.database.web_shop.models.ProductsProductOptions;
import com.database.web_shop.services.ProductsProductOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class ProductsProductOptionsController {

        public ProductsProductOptionsController(){

        }
        Logger log = Logger.getLogger(ProductsProductOptionsController.class.getName());

        @Autowired
        ProductsProductOptionsService productsProductOptionsService;

        @GetMapping("/productsProductOptions")
        public ResponseEntity<List<ProductsProductOptions>> allProductsProductOptions(){
            try {
                List<ProductsProductOptions> productsProductOptions = productsProductOptionsService.findAll();
                if (productsProductOptions.isEmpty()) {
                    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
                }
                return new ResponseEntity<>(productsProductOptions, HttpStatus.OK);
            } catch (NoSuchElementException e){
                log.info(e.toString());
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @PostMapping("/productsProductOptions")
        @ResponseBody
        public ResponseEntity<ProductsProductOptions> addProductsProductOptions (@RequestBody ProductsProductOptions productsProductOptions){
            log.info(productsProductOptions.toString());
            try {
                return new ResponseEntity<>(productsProductOptionsService.save(productsProductOptions), HttpStatus.CREATED);
            } catch (NoSuchElementException e){
                log.info(e.toString());
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }


        @DeleteMapping("/productsProductOptions")
        public ResponseEntity<?> deleteProductsProductOptions(@RequestBody ProductsProductOptions productsProductOptions){
            try {
                productsProductOptionsService.delete(productsProductOptions);
                return new ResponseEntity<>(HttpStatus.ACCEPTED);
            } catch (NoSuchElementException e){
                log.info(e.toString());
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }
}
