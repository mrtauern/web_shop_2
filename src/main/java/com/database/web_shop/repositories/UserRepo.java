package com.database.web_shop.repositories;

import com.database.web_shop.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserRepo")
public interface UserRepo extends JpaRepository<Users, Integer> {
}
