package com.itheima.operator;

public class OperatorDemo13 {
    public static void main(String[] args) {
        //需求2: 寻找7的有缘数，定义一个2位整数，只要该数字包含7或是7的倍数或有缘数

        // 1. 定义一个2位数
        int number = 24;

        // 包含7:个位或十位是7即可
        // 7的倍数： number % 7 == 0

        // 2. 获得个位，十位
        int ge = number % 10;
        int shi = number / 10;

        // 3. 判断当前数字是否为7的有缘数
        // ge ==7 || shi == 7 || number % 7 == 0
        boolean b = ge ==7 || shi == 7 || number % 7 == 0;
        System.out.println(b);
        

    }

}
