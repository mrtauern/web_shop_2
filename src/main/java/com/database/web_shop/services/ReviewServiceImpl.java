package com.database.web_shop.services;

import com.database.web_shop.models.Reviews;
import com.database.web_shop.repositories.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewService")
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public List<Reviews> findAll(){
        return reviewRepo.findAll();
    }

    @Override
    public Reviews findById(int id){
        return reviewRepo.findById(id).get();
    }

    @Override
    public Reviews save(Reviews reviews){
        return reviewRepo.save(reviews);
    }

    @Override
    public void deleteById(int id){
        reviewRepo.deleteById(id);
    }

    @Override
    public void delete(Reviews reviews){
        reviewRepo.delete(reviews);
    }
}
