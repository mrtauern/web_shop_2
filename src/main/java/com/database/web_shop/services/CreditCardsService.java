package com.database.web_shop.services;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CreditCardsService")
public interface CreditCardsService {
    List<CreditCards> findAll();

    CreditCards findById(int id);

    CreditCards save(CreditCards creditCards);

    void deleteById(int id);

    void delete(CreditCards creditCards);
}
