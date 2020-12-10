package com.database.web_shop.services;

import com.database.web_shop.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public interface UserService {
    List<Users> findAll();

    Users findById(int id);

    Users save(Users user);

    void deleteById(int id);

    void delete(Users user);
}
