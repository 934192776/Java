package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) { 
    
    // 练习一
    byte b = 100;
    short s = 200;
    double d = 20.3;

    // 请说出下面代码在计算的时候，类型转换的情况
    /*
    * 1. b + s
    * 先把byte100和short200类型提升位int类型
    * 结果 300（int)
    *  
    * 
    * 2. 结果 300(int) + d
    * int类型的300 会提升为double类型，300.0
    * 结果： 320.3（double)
    * 
    */
    
    double result1 = b + s + d;
    System.out.println(result1); // 320.3
    }

}
