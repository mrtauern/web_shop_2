package com.database.web_shop.repositories;


import com.database.web_shop.models.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("OrderStatusRepo")
public interface OrderStatusRepo extends JpaRepository<OrderStatus, Integer> {
}
