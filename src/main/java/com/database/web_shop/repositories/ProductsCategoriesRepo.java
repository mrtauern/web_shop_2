package com.database.web_shop.repositories;

import com.database.web_shop.models.ProductsCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductsCategoriesRepo")
public interface ProductsCategoriesRepo extends JpaRepository<ProductsCategories, Integer> {
}
