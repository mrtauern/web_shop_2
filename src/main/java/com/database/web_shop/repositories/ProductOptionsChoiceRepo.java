package com.database.web_shop.repositories;

import com.database.web_shop.models.ProductOptionsChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductsOptionsChoiceRepo")
public interface ProductOptionsChoiceRepo extends JpaRepository<ProductOptionsChoice, Integer> {
}
