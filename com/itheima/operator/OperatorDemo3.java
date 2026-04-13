package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) { 
    
    // 1. 定义变量记录秒数
    int seconds = 7242;

    // 2. 获取小时数
    int hours = seconds / 3600; //  3661 / 3600 = 1....61;
    System.out.println(hours);
    
    // 3. 计算分钟数
    // 总秒数-小时数： 3661-3600 = 61
    // 61 / 60 = 1分钟....1秒钟
    //3661 % 3600 = 1.....61
    // 7200 % 3600 = 2.....20
    int minutes = seconds / 60 % 60;
    System.out.println(minutes);
    
    // 4. 计算秒数
    int s = seconds % 3600 % 60;
    System.out.println(s);
    
    // 字符串拼接的形式打印数据
    // 2小时0分42秒
    System.out.println(hours + "小时" + minutes + "分" + s + "秒");
    
    }
}
