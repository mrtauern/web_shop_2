package com.database.web_shop.repositories;

import com.database.web_shop.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CategoriesRepo")
public interface CategoriesRepo extends JpaRepository<Categories, Integer> {
}
