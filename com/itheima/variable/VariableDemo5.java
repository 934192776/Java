package com.itheima.variable;

public class VariableDemo5 {
    public static void main(String[] args) {
        
    // BMI = 体重 / 身高的平方 

    // 1. 定义变量记录我的体重49KG
    double weight = 49;

    // 2. 定义变量记录我的身高1.75M
    double height = 1.58;

    // 3. 计算BMI
    double bmi = weight / (height * height);
    System.out.println(bmi);

}

}
