package com.itheima.ifdemo;

public class IfDemo7 {
    public static void main(String[] args) {
        /*
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

                // 1. 定义变量，记录价格
                double price = 1000;

                // 2. 定义变量记录使用优惠券后的价格
                double discountprice = 0;

                // 3. 计算使用优惠券后的价格
             if (price > 0){
                if(price <= 10){
                    discountprice = price;
                }else if(price >= 50){
                    discountprice = price - 8;
                }else if(price <= 100){
                    discountprice = price - 30;
                }else if(price <= 200){
                    discountprice = price - 50;
                }else{
                    discountprice = price - 90;
                }
             }else {
                System.out.println("价格有误");
             }

             // 4. 定义变量记录使用会员之后的价格
             double memberprice = price*0.8
             
             // 5. 比较优惠券的价格和会员卡的价格
            if(discountprice < memberprice){
                System.out.println("直接采取代金券即可" + discountprice);
            }else{
                System.out.println("会员打折" + memberprice);
            }
            
        }
    }

