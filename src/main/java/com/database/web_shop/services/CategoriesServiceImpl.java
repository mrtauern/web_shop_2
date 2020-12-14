package com.database.web_shop.services;

import com.database.web_shop.models.Categories;
import com.database.web_shop.repositories.CategoriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoriesService")
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    CategoriesRepo categoriesRepo;

    @Override
    public List<Categories> findAll(){
        return categoriesRepo.findAll();
    }

    @Override
    public Categories findById(int id){
        return categoriesRepo.findById(id).get();
    }

    @Override
    public Categories save(Categories categories){
        return categoriesRepo.save(categories);
    }

    @Override
    public void deleteById(int id){
        categoriesRepo.deleteById(id);
    }

    @Override
    public void delete(Categories categories){
        categoriesRepo.delete(categories);
    }
}
