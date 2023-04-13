package com.example.demo.pojo;

public class trade {
    private int tradeId;
    private int userId;
    private int walletId;
    private int tradetype;
    private int tMoney;

    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public int getTradetype() {
        return tradetype;
    }

    public void setTradetype(int tradetype) {
        this.tradetype = tradetype;
    }

    public int gettMoney() {
        return tMoney;
    }

    public void settMoney(int tMoney) {
        this.tMoney = tMoney;
    }
}
