package com.example.demo.controller;

import com.example.demo.dao.GoodsDao;
import com.example.demo.model.PO.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class GoodsController {
    @Autowired
    private GoodsDao goodsDao;
    @PostMapping("/add")
    public  String login(Goods goods){
        Date date = new Date();
        goods.setCreateTime(date);
        goods.setUpdateTime(date);
        goods.setDeleteFlag(0);
        goodsDao.addGoods(goods);
        System.out.println(goods);
        return "{\"status\":\"ok\"}";

    }
    @GetMapping("/select")
    public Goods select1( String goodsname){
        Goods goods=goodsDao.selectGoodsByname(goodsname);
        System.out.println(goods);
        return goods;

    }
    @DeleteMapping("/del")
    public String deleteUser(String goodsname){
        goodsDao.deleteGoodsByName(goodsname);
        return "{\"status\":\"ok\"}";
    }
    @PutMapping("/update")
    public String updateuser(Goods goods){
        goodsDao.updateGoodsByName(goods);
        return "{\"status\":\"ok\"}";
    }
}
