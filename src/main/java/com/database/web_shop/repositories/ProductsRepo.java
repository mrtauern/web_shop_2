package com.database.web_shop.repositories;

import com.database.web_shop.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductsRepo")
public interface ProductsRepo extends JpaRepository<Products, Integer> {
}
