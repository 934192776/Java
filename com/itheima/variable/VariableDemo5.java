package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args) {
        
    // BMI = 体重 / 身高的平方     

    // 1. 键盘录入体重 kg 
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入体重：");
    double weight = sc.nextDouble();

    // 2. 键盘录入身高 m
    System.out.println("请输入身高：");
    double height = sc.nextDouble();

    // 3. 计算BMI
    double bmi = weight / (height * height);
    System.out.println(bmi);
}

}
