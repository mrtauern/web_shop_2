package com.database.web_shop.services;

import com.database.web_shop.models.Users;
import com.database.web_shop.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<Users> findAll(){
        return userRepo.findAll();
    }

    @Override
    public Users findById(int id){
        return userRepo.findById(id).get();
    }

    @Override
    public Users save(Users user){
        return userRepo.save(user);
    }

    @Override
    public void deleteById(int id){
        userRepo.deleteById(id);
    }

    @Override
    public void delete(Users user){
        userRepo.delete(user);
    }
}
