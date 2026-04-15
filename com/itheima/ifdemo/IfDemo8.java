package com.itheima.ifdemo;

public class IfDemo8 {
    public static void main(String[] args) {
        /*
        或者这样写
        需求：
          很多app里都有不同的优惠券
          假设，现在有以下优惠券
          全场商品满10减8
                 满50减30
                 满100减50
                 满200减90

                 会员卡：全场8折
                请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
         */

                // 1. 定义变量记录商品的价格
                double price = 1000;

                // 2. 定义变量使用优惠券后，可以少付的钱
                double discountprice = 0;

                // 3. 计算使用优惠券后，可以少付的钱
                if(price > 0){
                  if(price < 10) discountprice = 0;
                  else if(price < 50) discountprice = 8;                     
                  else if(price < 100) discountprice = 30;
                  else if(price < 200) discountprice = 50;
                  else discountprice = 90;
              } else {
                  System.out.println("商品价格有误");
              }
             // System.out.println("使用优惠券后，可以少付的钱" + discountprice);
                 
            // 4. 定义变量后，可以少付的钱
             double memberprice = price * 0.2;

             // 5. 判断
             if(discountprice > memberprice){
                 System.out.println("使用优惠券，可以少付" + discountprice);
             }else {
                 System.out.println("使用会员卡，可以少付" + memberprice);
             }           
            
        }
    }

