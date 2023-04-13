package com.example.demo.service;

import com.example.demo.pojo.trade;
import com.example.demo.pojo.wallet;

import java.util.List;

public interface tradeService {
    public int getBalance(int userId);
    public Boolean costM(wallet wallet);
    public List<trade> getTradeRecode(int userId);
}
