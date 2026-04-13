package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 实现字母的大小写转换，将大写字母转换为小写字母
        // A -----> a

        // 定义变量记录大写的字符
        char c = 'A'; 
        // 2. 转成小写
        // 65 + 32 = 97
        char cc = (char)(c + 32);
        System.out.println(cc);

    
        // 自增自减运算符
        // 符号     说明
        // ++      变量的值 +1 自增
        // --      变量的值 -1 自减
        
        
        int a = 10;
        a++; // 11
        ++a; // 12
        --a; // 11
        a--; // 10
        a--; // 9
        System.out.println(a); // 答案 = 9
    }

}
