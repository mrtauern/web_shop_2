package com.database.web_shop.services;

import com.database.web_shop.models.Items;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ItemService")
public interface ItemService {
    List<Items> findAll();

    Items findById(int id);

    Items save(Items item);

    void deleteById(int id);

    void delete(Items item);
}
