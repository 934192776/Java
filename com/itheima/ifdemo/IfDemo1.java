package com.itheima.ifdemo;

public class IfDemo1 {
    public static void main(String[] args) {
        /*
        定义一个变量表示人的体温，对体温进行判断是否大于等于38度，如果超过打印语言警告                  
        */

        // 1. 定义一个变量表示人的体温
        double bodyTemperature = 39.5;

        // 2. 对体温进行判断
        if(bodyTemperature >= 38){
            System.out.println("语言警告,当前体温已经超过38度,请速速到医院检查");
        }
        else{
            System.out.println("恭喜,当前体温没有超过38度");
        }
  
    }

}
