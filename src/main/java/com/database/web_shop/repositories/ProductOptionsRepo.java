package com.database.web_shop.repositories;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.ProductOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductOptionsRepo")
public interface ProductOptionsRepo extends JpaRepository<ProductOptions, Integer> {
}
