package com.database.web_shop.services;

import com.database.web_shop.models.ProductsCategories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsCategoriesService")
public interface ProductsCategoriesService {

    List<ProductsCategories> findAll();


    ProductsCategories findById(int id);


    ProductsCategories save(ProductsCategories productsCategory);

    void deleteById(int id);

    void delete(ProductsCategories productsCategory);
}


