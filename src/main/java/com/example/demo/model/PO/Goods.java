package com.example.demo.model.PO;

import com.example.demo.model.PO.base.BaseEntity;

public class Goods extends BaseEntity {
      private String goodsname;
      private float price;

      public Goods() {

      }
      public Goods(String goodsname ,float price) {
            this.goodsname = goodsname;
            this.price=price;
      }

}
