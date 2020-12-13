package com.database.web_shop.services;

import com.database.web_shop.models.ProductsProductOptions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsProductOptionsService")
public interface ProductsProductOptionsService {

    List<ProductsProductOptions> findAll();

    ProductsProductOptions findById(int id);

    ProductsProductOptions save(ProductsProductOptions productsProductOptions);

    void deleteById(int id);

    void delete(ProductsProductOptions productsProductOptions);
}
