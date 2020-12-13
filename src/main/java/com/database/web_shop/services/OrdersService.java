package com.database.web_shop.services;

import com.database.web_shop.models.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrdersService")
public interface OrdersService {
    List<Orders> findAll();

    Orders findById(int id);

    Orders save(Orders order);

    void deleteById(int id);

    void delete(Orders order);

}
