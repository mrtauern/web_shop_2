package com.database.web_shop.repositories;

import com.database.web_shop.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("OrdersRepo")
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
}
