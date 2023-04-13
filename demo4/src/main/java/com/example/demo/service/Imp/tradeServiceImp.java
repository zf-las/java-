package com.example.demo.service.Imp;

import com.example.demo.Dao.tradeDao;
import com.example.demo.pojo.trade;
import com.example.demo.pojo.wallet;
import com.example.demo.service.tradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tradeServiceImp implements tradeService {
    @Autowired
    private tradeDao dao;
    @Override
    public int getBalance(int userId) {
        return dao.getBalance(userId);
    }

    @Override
    public Boolean costM(wallet wallet) {
        return dao.costM(wallet);
    }

    @Override
    public List<trade> getTradeRecode(int userId) {
        return dao.getTradeRecode(userId);
    }
}
