package com.database.web_shop.services;

import com.database.web_shop.models.Categories;
import com.database.web_shop.models.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrderStatusService")
public interface OrderStatusService {
    List<OrderStatus> findAll();

    OrderStatus findById(int id);

    OrderStatus save(OrderStatus orderStatus);

    void deleteById(int id);

    void delete(OrderStatus orderStatus);
}
