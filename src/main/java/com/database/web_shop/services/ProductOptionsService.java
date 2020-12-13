package com.database.web_shop.services;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.ProductOptions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductOptionsService")
public interface ProductOptionsService {
    List<ProductOptions> findAll();

    ProductOptions findById(int id);

    ProductOptions save(ProductOptions productOptions);

    void deleteById(int id);

    void delete(ProductOptions productOptions);
}
