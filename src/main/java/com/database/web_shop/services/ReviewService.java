package com.database.web_shop.services;

import com.database.web_shop.models.Reviews;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewService")
public interface ReviewService {
    List<Reviews> findAll();

    Reviews findById(int id);

    Reviews save(Reviews reviews);

    void deleteById(int id);

    void delete(Reviews reviews);
}
