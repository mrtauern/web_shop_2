package com.database.web_shop.services;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.ProductOptions;
import com.database.web_shop.repositories.CreditCardsRepo;
import com.database.web_shop.repositories.ProductOptionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductOptionsService")
public class ProductOptionsServiceImpl implements ProductOptionsService {

    @Autowired
    ProductOptionsRepo productOptionsRepo;

    @Override
    public List<ProductOptions> findAll(){
        return productOptionsRepo.findAll();
    }

    @Override
    public ProductOptions findById(int id){
        return productOptionsRepo.findById(id).get();
    }

    @Override
    public ProductOptions save(ProductOptions productOptions){
        return productOptionsRepo.save(productOptions);
    }

    @Override
    public void deleteById(int id){
        productOptionsRepo.deleteById(id);
    }

    @Override
    public void delete(ProductOptions productOptions){
        productOptionsRepo.delete(productOptions);
    }
}
