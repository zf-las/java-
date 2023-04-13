package com.example.demo.controller;

import com.example.demo.pojo.trade;
import com.example.demo.pojo.wallet;
import com.example.demo.service.Imp.tradeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class test {
    @Autowired
    private tradeServiceImp tradeService;

    /**
     * 用户消费
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/costSalary")
    public String getSalary(){
//        int userId=Integer.parseInt(request.getParameter("userId"));
//        int salary=tradeService.getBalance(1);
//        int cost=Integer.parseInt(request.getParameter("cost"));
        int userId=1;
        int salary=tradeService.getBalance(userId);
        int cost=100;
        wallet wallet=new wallet();
        wallet.setUserId(userId);

        if(cost>salary)
            return "余额不足";
        else{
            wallet.setBalance(salary-cost);
            tradeService.costM(wallet);
            return "成功";
        }

    }

    /**
     * 退款
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/repayM")
    public String repay(){
        int userId=1;
        int salary=tradeService.getBalance(1);
        int repay=20;
        wallet wallet=new wallet();
        wallet.setUserId(userId);
        wallet.setBalance(repay+salary);
        tradeService.costM(wallet);
        return "成功";
    }

    @ResponseBody
    @RequestMapping(value = "/getRecode")
    public List getRocode(){
        int userId=1;
        List<trade> list=new ArrayList();
        list=tradeService.getTradeRecode(userId);
        return list;
    }
}
