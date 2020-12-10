package com.database.web_shop.services;

import com.database.web_shop.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsService")
public interface ProductsService {
    List<Products> findAll();

    Products findById(int id);

    Products save(Products products);

    void deleteById(int id);

    void delete(Products products);
}
