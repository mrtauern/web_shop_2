package com.database.web_shop.services;

import com.database.web_shop.models.ProductsCategories;
import com.database.web_shop.repositories.ProductsCategoriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsCategoriesService")
public class ProductsCategoriesServiceImpl implements ProductsCategoriesService {

    @Autowired
    ProductsCategoriesRepo productsCategoriesRepo;

    @Override
    public List<ProductsCategories> findAll(){
        return productsCategoriesRepo.findAll();
    }

    @Override
    public ProductsCategories findById(int id){
        return productsCategoriesRepo.findById(id).get();
    }

    @Override
    public ProductsCategories save(ProductsCategories productsCategories){
        return productsCategoriesRepo.save(productsCategories);
    }

    @Override
    public void deleteById(int id){
        productsCategoriesRepo.deleteById(id);
    }

    @Override
    public void delete(ProductsCategories productsCategories){
        productsCategoriesRepo.delete(productsCategories);
    }
}
