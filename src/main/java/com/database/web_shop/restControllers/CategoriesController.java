package com.database.web_shop.restControllers;

import com.database.web_shop.models.Categories;
import com.database.web_shop.models.Products;
import com.database.web_shop.services.CategoriesService;
import com.database.web_shop.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class CategoriesController {
    public CategoriesController() {

    }

    Logger log = Logger.getLogger(CategoriesController.class.getName());

    @Autowired
    CategoriesService categoriesService;

    @GetMapping("/categories")
    public ResponseEntity<List<Categories>> allCategories(){
        try {
            List<Categories> categories = categoriesService.findAll();
            if (categories.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(categories, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Categories> oneCategory(@PathVariable int id){
        try {
            return new ResponseEntity<>(categoriesService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/categories")
    @ResponseBody
    public ResponseEntity<Categories> addCategory(@RequestBody Categories categories){
        log.info(categories.toString());
        /*user.setCountry(countriesService.findById(58L));
        user.setOrders(null);
        user.setReviews(null);*/
        try {
            return new ResponseEntity<>(categoriesService.save(categories), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<Categories> editCategory(@RequestBody Categories categories, @PathVariable int id){
        try {
            Categories _categories = categoriesService.findById(id);
            categories.setId(_categories.getId());
            return new ResponseEntity<>(categoriesService.save(categories), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable int id){
        try {
            categoriesService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
