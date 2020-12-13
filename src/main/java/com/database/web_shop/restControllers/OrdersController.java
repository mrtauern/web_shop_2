package com.database.web_shop.restControllers;

import com.database.web_shop.models.Orders;
import com.database.web_shop.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class OrdersController {

    public OrdersController(){

    }
    Logger log = Logger.getLogger(OrdersController.class.getName());

    @Autowired
    OrdersService ordersService;

    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> allOrders(){
        try {
            List<Orders> orders = ordersService.findAll();
            if (orders.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Orders> oneOrder(@PathVariable int id){
        try {
            return new ResponseEntity<>(ordersService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/order")
    @ResponseBody
    public ResponseEntity<Orders> addOrder(@RequestBody Orders order){
        log.info(order.toString());
        try {
            return new ResponseEntity<>(ordersService.save(order), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/order/{id}")
    public ResponseEntity<Orders> editOrder(@RequestBody Orders order, @PathVariable int id){
        try {
            Orders _order = ordersService.findById(id);
            order.setId(_order.getId());
            return new ResponseEntity<>(ordersService.save(order), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable int id){
        try {
            ordersService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
