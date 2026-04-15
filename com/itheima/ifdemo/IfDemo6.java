package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        /*
        
         需求： 小明在每次订外卖都会在多家平台对比，看谁的优惠力度大
         已知：
            饱了么 app : 全场9折优惠
            美单app: 满30减10元
            
         请问1: 
            小明买了一顿烧烤50元，在哪家下单更划算？
         请问2:
            如果价格不确定，数据由键盘录入而来？
         细节： 
            变量只在所属的大括号中是有效的
            */

            // 1. 定义一个变量记录价格
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入价格：");
            double price = sc.nextDouble();

            // 2. 计算2个app优惠后的价格
            double price1 = price * 0.9; // 饱了么app

            double price2 = 0;
            if(price>= 30){
                //满30减10元
                price2 = price - 10;
            }else{
                // 原价
                price2 = price;
            }

            // 3. 判断
            if(price1 < price2){
                System.out.println("饱了么app下单更划算");
            }else{
                System.out.println("美单app下单更划算");
            }            

            }
        }

