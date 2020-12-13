package com.database.web_shop.repositories;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CreditCardsRepo")
public interface CreditCardsRepo extends JpaRepository<CreditCards, Integer> {
}
