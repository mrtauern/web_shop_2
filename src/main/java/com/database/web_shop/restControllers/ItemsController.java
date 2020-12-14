package com.database.web_shop.restControllers;

import com.database.web_shop.models.Items;
import com.database.web_shop.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;



@RestController
@RequestMapping("/api")
public class ItemsController {

    public ItemsController(){

    }
    Logger log = Logger.getLogger(ItemsController.class.getName());

    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    public ResponseEntity<List<Items>> allItems(){
        try {
            List<Items> items = itemService.findAll();
            if (items.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<Items> oneItem(@PathVariable int id){
        try {
            return new ResponseEntity<>(itemService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/item")
    @ResponseBody
    public ResponseEntity<Items> addItem(@RequestBody Items item){
        log.info(item.toString());
        try {
            return new ResponseEntity<>(itemService.save(item), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Items> editItem(@RequestBody Items item, @PathVariable int id){
        try {
            Items _item = itemService.findById(id);
            item.setId(_item.getId());
            return new ResponseEntity<>(itemService.save(item), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable int id){
        try {
            itemService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}


