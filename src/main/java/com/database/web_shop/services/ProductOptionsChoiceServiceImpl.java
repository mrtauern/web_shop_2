package com.database.web_shop.services;

import com.database.web_shop.models.ProductOptionsChoice;
import com.database.web_shop.models.Products;
import com.database.web_shop.repositories.ProductOptionsChoiceRepo;
import com.database.web_shop.repositories.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductOptionsChoiceService")
public class ProductOptionsChoiceServiceImpl implements ProductOptionsChoiceService{
    @Autowired
    ProductOptionsChoiceRepo productOptionsChoiceRepo;

    @Override
    public List<ProductOptionsChoice> findAll(){
        return productOptionsChoiceRepo.findAll();
    }

    @Override
    public ProductOptionsChoice findById(int id){
        return productOptionsChoiceRepo.findById(id).get();
    }

    @Override
    public ProductOptionsChoice save(ProductOptionsChoice productOptionsChoice){
        return productOptionsChoiceRepo.save(productOptionsChoice);
    }

    @Override
    public void deleteById(int id){
        productOptionsChoiceRepo.deleteById(id);
    }

    @Override
    public void delete(ProductOptionsChoice productOptionsChoice){
        productOptionsChoiceRepo.delete(productOptionsChoice);
    }
}
