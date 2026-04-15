package com.itheima.ifdemo;

public class IfDemo3 {
    public static void main(String[] args) {
        /*
           if的细节：
              1. if语句大括号的位置
                 左括号写在上一行的末尾，不要单独写一行

                 k&r 风格（紧凑风）：左括号在上一行末尾
                 allman 风格（折叠风）：左括号另起一行

                 k&r风格：
                    创造c语言的两位大神
                    布莱恩·克尼汉 brian kernighan
                    丹尼斯·里奇 dennis ritchie
                    《the c programming language》书里两种风格都用到了
                    仿照大神的风格，从两个名字各取一个字母，左括号在上一行的末尾---> k&r风格
                    java go
                    java: oracle官方示例 谷歌编码规范 spring框架----> k&r风格

                    allman风格：
                    bsd unix操作系统的主要开发者艾瑞克·奥尔曼（eric·allman)
                    c#----> allman风格


              2. if语句大括号的省略
                 如果大括号中语句体只有一行，大括号可以省略
              3. 小括号后面不能有分号
                 小括号后不能有分号，这样会拆开if的语句结构
              4. 判断布尔类型的变量
                判断布尔类型的变量，直接把变量写在小括号中即可                  
        */

                // 1. 定义一个变量表示人的体温
                double bodyTemperature = 36.5;

                // 2. 对体温进行判断
                if(bodyTemperature >= 37.5){
                    System.out.println("请速速到医院检查");
                }

                // 或者写成这样无大括号，因为只有一行语句
                if(bodyTemperature >= 37.5) System.out.println("请速速到医院检查");
                
    }

}
