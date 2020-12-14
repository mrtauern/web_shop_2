package com.database.web_shop.services;

import com.database.web_shop.models.Orders;
import com.database.web_shop.repositories.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrdersService")
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersRepo ordersRepo;

    @Override
    public List<Orders> findAll(){
        return ordersRepo.findAll();
    }

    @Override
    public Orders findById(int id){
        return ordersRepo.findById(id).get();
    }

    @Override
    public Orders save(Orders order){
        return ordersRepo.save(order);
    }

    @Override
    public void deleteById(int id){
        ordersRepo.deleteById(id);
    }

    @Override
    public void delete(Orders order){
        ordersRepo.delete(order);
    }
}
