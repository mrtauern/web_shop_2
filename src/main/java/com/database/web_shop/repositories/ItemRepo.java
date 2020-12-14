package com.database.web_shop.repositories;

import com.database.web_shop.models.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ItemRepo")
public interface ItemRepo extends JpaRepository<Items, Integer> {
}
