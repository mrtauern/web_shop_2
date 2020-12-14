package com.database.web_shop.services;

import com.database.web_shop.models.ProductOptions;
import com.database.web_shop.models.ProductOptionsProductOptionsChoice;
import com.database.web_shop.repositories.ProductOptionsProductOptionsChoiceRepo;
import com.database.web_shop.repositories.ProductOptionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductOptionsProductOptionsChoiceService")
public class ProductOptionsProductOptionsChoiceServiceImpl implements ProductOptionsProductOptionsChoiceService {

    @Autowired
    ProductOptionsProductOptionsChoiceRepo productOptionsProductOptionsChoiceRepo;

    @Override
    public List<ProductOptionsProductOptionsChoice> findAll(){
        return productOptionsProductOptionsChoiceRepo.findAll();
    }

    @Override
    public ProductOptionsProductOptionsChoice findById(int id){
        return productOptionsProductOptionsChoiceRepo.findById(id).get();
    }

    @Override
    public ProductOptionsProductOptionsChoice save(ProductOptionsProductOptionsChoice productOptionsProductOptionsChoice){
        return productOptionsProductOptionsChoiceRepo.save(productOptionsProductOptionsChoice);
    }

    @Override
    public void deleteById(int id){
        productOptionsProductOptionsChoiceRepo.deleteById(id);
    }

    @Override
    public void delete(ProductOptionsProductOptionsChoice productOptionsProductOptionsChoice){
        productOptionsProductOptionsChoiceRepo.delete(productOptionsProductOptionsChoice);
    }
}
