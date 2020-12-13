package com.database.web_shop.restControllers;

import com.database.web_shop.models.OrderStatus;
import com.database.web_shop.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class OrderStatusController {
    public OrderStatusController() {

    }
    Logger log = Logger.getLogger(OrderStatusController.class.getName());

    @Autowired
    OrderStatusService orderStatusService;

    @GetMapping("/orderstatus")
    public ResponseEntity<List<OrderStatus>> allOrderStatus(){
        try {
            List<OrderStatus> orderStatuses = orderStatusService.findAll();
            if (orderStatuses.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(orderStatuses, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/orderstatus/{id}")
    public ResponseEntity<OrderStatus> oneOrderStatus(@PathVariable int id){
        try {
            return new ResponseEntity<>(orderStatusService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/orderstatus")
    @ResponseBody
    public ResponseEntity<OrderStatus> addOrderStatus(@RequestBody OrderStatus orderStatus){
        log.info(orderStatus.toString());
        try {
            return new ResponseEntity<>(orderStatusService.save(orderStatus), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/orderstatus/{id}")
    public ResponseEntity<OrderStatus> editOrderStatus(@RequestBody OrderStatus orderStatus, @PathVariable int id){
        try {
            OrderStatus _orderStatus = orderStatusService.findById(id);
            orderStatus.setId(_orderStatus.getId());
            return new ResponseEntity<>(orderStatusService.save(orderStatus), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/orderstatus/{id}")
    public ResponseEntity<?> deleteOrderStatus(@PathVariable int id){
        try {
            orderStatusService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
