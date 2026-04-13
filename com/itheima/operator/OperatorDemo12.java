package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo12 {public static void main(String[] args) {
    /*
      需求1:
        键盘录入一个4位整数，判断这个数字是否为回文数
      需求2:
        寻找7的有缘数，定义一个2位整数，只要该数字包含7或是7的倍数或有缘数
    */

    // 1. 键盘录入一个4位整数
    Scanner sc = new Scanner(System.in);
    System.out.println("输入一个4位数");
    int number = sc.nextInt();


    // 2. 数字拆分
    int ge = number % 10;
    int shi = number / 10 % 10;
    int bai = number / 100 % 10;
    int qian = number / 1000;
    System.out.println(ge);
    System.out.println(shi);
    System.out.println(bai);
    System.out.println(qian);

    // 3. 判断这个数字是否为回文数
    // qian == ge &&  bai == shi

    boolean result = qian == ge &&  bai == shi;
    System.out.println(result);


}

}
