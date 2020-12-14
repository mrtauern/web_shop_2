package com.database.web_shop.services;

import com.database.web_shop.models.ProductOptionsChoice;
import com.database.web_shop.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductOptionsChoiceService")
public interface ProductOptionsChoiceService {
    List<ProductOptionsChoice> findAll();

    ProductOptionsChoice findById(int id);

    ProductOptionsChoice save(ProductOptionsChoice productOptionsChoice);

    void deleteById(int id);

    void delete(ProductOptionsChoice productOptionsChoice);
}
