package com.database.web_shop.services;

import com.database.web_shop.models.Products;
import com.database.web_shop.repositories.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsService")
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepo productsRepo;

    @Override
    public List<Products> findAll(){
        return productsRepo.findAll();
    }

    @Override
    public Products findById(int id){
        return productsRepo.findById(id).get();
    }

    @Override
    public Products save(Products products){
        return productsRepo.save(products);
    }

    @Override
    public void deleteById(int id){
        productsRepo.deleteById(id);
    }

    @Override
    public void delete(Products products){
        productsRepo.delete(products);
    }
}
