package com.database.web_shop.repositories;

import com.database.web_shop.models.ProductsProductOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductsProductOptionsRepo")
public interface ProductsProductOptionsRepo extends JpaRepository<ProductsProductOptions, Integer> {
}
