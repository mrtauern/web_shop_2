package com.database.web_shop.repositories;

import com.database.web_shop.models.ProductOptions;
import com.database.web_shop.models.ProductOptionsProductOptionsChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductOptionsProductOptionsChoiceRepo")
public interface ProductOptionsProductOptionsChoiceRepo extends JpaRepository<ProductOptionsProductOptionsChoice, Integer> {
}
