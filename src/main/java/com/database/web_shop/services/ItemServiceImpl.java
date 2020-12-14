package com.database.web_shop.services;

import com.database.web_shop.models.Items;
import com.database.web_shop.repositories.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ItemService")
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemRepo itemRepo;

    @Override
    public List<Items> findAll(){
        return itemRepo.findAll();
    }

    @Override
    public Items findById(int id){
        return itemRepo.findById(id).get();
    }

    @Override
    public Items save(Items item){
        return itemRepo.save(item);
    }

    @Override
    public void deleteById(int id){
        itemRepo.deleteById(id);
    }

    @Override
    public void delete(Items item){
        itemRepo.delete(item);
    }
}
