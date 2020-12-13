package com.database.web_shop.services;

import com.database.web_shop.models.ProductOptions;
import com.database.web_shop.models.ProductOptionsProductOptionsChoice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductOptionsProductOptionsChoiceService")
public interface ProductOptionsProductOptionsChoiceService {
    List<ProductOptionsProductOptionsChoice> findAll();

    ProductOptionsProductOptionsChoice findById(int id);

    ProductOptionsProductOptionsChoice save(ProductOptionsProductOptionsChoice productOptionsProductOptionsChoice);

    void deleteById(int id);

    void delete(ProductOptionsProductOptionsChoice productOptionsProductOptionsChoice);
}
