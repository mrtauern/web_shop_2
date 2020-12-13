package com.database.web_shop.services;

import com.database.web_shop.models.Categories;
import com.database.web_shop.models.OrderStatus;
import com.database.web_shop.repositories.CategoriesRepo;
import com.database.web_shop.repositories.OrderStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrderStatusService")
public class OrderStatusServiceImpl implements OrderStatusService{

    @Autowired
    OrderStatusRepo orderStatusRepo;

    @Override
    public List<OrderStatus> findAll(){
        return orderStatusRepo.findAll();
    }

    @Override
    public OrderStatus findById(int id){
        return orderStatusRepo.findById(id).get();
    }

    @Override
    public OrderStatus save(OrderStatus orderStatus){
        return orderStatusRepo.save(orderStatus);
    }

    @Override
    public void deleteById(int id){
        orderStatusRepo.deleteById(id);
    }

    @Override
    public void delete(OrderStatus orderStatus){
        orderStatusRepo.delete(orderStatus);
    }
}
