package com.database.web_shop.services;

import com.database.web_shop.models.ProductsProductOptions;
import com.database.web_shop.repositories.ProductsProductOptionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsProductOptionsService")
public class ProductsProductOptionsServiceImpl implements ProductsProductOptionsService {

    @Autowired
    ProductsProductOptionsRepo productsProductOptionsRepo;

    @Override
    public List<ProductsProductOptions> findAll(){
        return productsProductOptionsRepo.findAll();
    }

    @Override
    public ProductsProductOptions findById(int id){
        return productsProductOptionsRepo.findById(id).get();
    }

    @Override
    public ProductsProductOptions save(ProductsProductOptions productsProductOptions){
        return productsProductOptionsRepo.save(productsProductOptions);
    }

    @Override
    public void deleteById(int id){
        productsProductOptionsRepo.deleteById(id);
    }

    @Override
    public void delete(ProductsProductOptions productsProductOptions){
        productsProductOptionsRepo.delete(productsProductOptions);
    }
}
