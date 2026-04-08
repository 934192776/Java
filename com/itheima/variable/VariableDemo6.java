package com.itheima.variable;

// 确定scanner的位置
import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
        /*
        
          键盘录入：
            第一步： 找到scanner 这个打工人
            第二步： 让scanner干活
        */


            // 1. 找到scanner这个打工人
            Scanner sc = new Scanner(System.in);

            // 2. 让scanner干活
            // 接受键盘录入的整数
            
            /* int num = sc.nextInt();
            System.out.println(num);
            */ 

            // 接受键盘录入的小数
            double num = sc.nextDouble();
            System.out.println(num);
            // 接受键盘录入的文本（字符串)
            String name = sc.next();
            System.out.println(name);
            // 接受键盘录入的布尔值
            boolean flag = sc.nextBoolean();
            System.out.println(flag);
            
    }

}
