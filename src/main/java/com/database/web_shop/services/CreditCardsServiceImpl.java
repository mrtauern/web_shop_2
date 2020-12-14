package com.database.web_shop.services;

import com.database.web_shop.models.CreditCards;
import com.database.web_shop.models.Users;
import com.database.web_shop.repositories.CreditCardsRepo;
import com.database.web_shop.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CreditCardsService")
public class CreditCardsServiceImpl implements CreditCardsService {

    @Autowired
    CreditCardsRepo creditCardsRepo;

    @Override
    public List<CreditCards> findAll(){
        return creditCardsRepo.findAll();
    }

    @Override
    public CreditCards findById(int id){
        return creditCardsRepo.findById(id).get();
    }

    @Override
    public CreditCards save(CreditCards creditCards){
        return creditCardsRepo.save(creditCards);
    }

    @Override
    public void deleteById(int id){
        creditCardsRepo.deleteById(id);
    }

    @Override
    public void delete(CreditCards creditCards){
        creditCardsRepo.delete(creditCards);
    }
}
