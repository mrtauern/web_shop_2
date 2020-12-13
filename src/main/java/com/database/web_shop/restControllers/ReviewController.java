package com.database.web_shop.restControllers;

import com.database.web_shop.models.Reviews;
import com.database.web_shop.services.ProductsService;
import com.database.web_shop.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class ReviewController {

    public ReviewController(){

    }

    Logger log = Logger.getLogger(ReviewController.class.getName());

    @Autowired
    ReviewService reviewService;

    @GetMapping("/reviews")
    public ResponseEntity<List<Reviews>> allReviews(){
        try {
            List<Reviews> reviews = reviewService.findAll();
            if (reviews.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(reviews, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/reviews/{id}")
    public ResponseEntity<Reviews> oneReview(@PathVariable int id){
        try {
            return new ResponseEntity<>(reviewService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/reviews")
    @ResponseBody
    public ResponseEntity<Reviews> addReview(@RequestBody Reviews review){
        log.info(review.toString());
        try {
            return new ResponseEntity<>(reviewService.save(review), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/reviews/{id}")
    public ResponseEntity<Reviews> editProduct(@RequestBody Reviews reviews, @PathVariable int id){
        try {
            Reviews _reviews = reviewService.findById(id);
            reviews.setId(_reviews.getId());
            return new ResponseEntity<>(reviewService.save(reviews), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id){
        try {
            reviewService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
