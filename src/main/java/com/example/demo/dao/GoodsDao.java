package com.example.demo.dao;

import com.example.demo.model.PO.Goods;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GoodsDao{
   @Insert("insert into goods(goodsname,price,createTime,updateTime,createUserId,updateUserId,deleteFlag) values(#{goodsname},#{price},#{createTime},#{updateTime},#{createUserId},#{updateUserId},#{deleteFlag})")
    void addGoods(Goods goods);
    @Select("select * from goods where goodsname=#{goodsname}")
    Goods selectGoodsByname(String goodsname);
    @Delete("delete from goods where goodsname=#{goodsname}")
    void deleteGoodsByName(String goodsname);
    @Update("update goods set price=#{price} where goodsname=#{goodsname}")
    void updateGoodsByName(Goods goods);

}
