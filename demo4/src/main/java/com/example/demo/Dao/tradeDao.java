package com.example.demo.Dao;

import com.example.demo.pojo.trade;
import com.example.demo.pojo.wallet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface tradeDao {
    public int getBalance(int userId);
    public Boolean costM(wallet wallet);
    public List<trade> getTradeRecode(int userId);
}
