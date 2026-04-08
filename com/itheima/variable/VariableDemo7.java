package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        /*
          定义两个整数定义的变量num1和num2,键盘录入数据分别为两个变量赋值。
          求两个数的和并进行打印。
         */

        // 1. 找到scanner这个打工人
        Scanner sc = new Scanner(System.in);

        // 2. 让scanner干活
        System.out.println("请键盘录入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println(num1);

        // 3. 让scanner再次接收第二个整数
        System.out.println("请键盘录入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println(num2);


        // 4. 求和
        int sum = num1 + num2;
        System.out.println("两个数的和是：" + sum);
    }

}
