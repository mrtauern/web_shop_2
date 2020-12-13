package com.database.web_shop.repositories;

import com.database.web_shop.models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ReviewRepo")
public interface ReviewRepo extends JpaRepository<Reviews, Integer> {
}
