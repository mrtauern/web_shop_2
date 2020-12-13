package com.database.web_shop.services;

import com.database.web_shop.models.Categories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoriesService")
public interface CategoriesService {
    List<Categories> findAll();

    Categories findById(int id);

    Categories save(Categories categories);

    void deleteById(int id);

    void delete(Categories categories);
}
