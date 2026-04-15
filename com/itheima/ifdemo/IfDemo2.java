package com.itheima.ifdemo;
import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {        
    
    /*
      需求： 初始最大生命200，受到x点伤害，技能恢复y点血，x和y由键盘录入而来
      假设，游戏人物不会死亡，最少1点血
      问，最终游戏人物血量是多少
       */
      // 1. 定义一个变量，记录游戏人物的初始生命值
      int life = 200;

      // 2. 键盘输入伤害值，表示当前任务受到的伤害
      System.out.println("请输入伤害值:");
      Scanner sc = new Scanner(System.in);     
      int hurt = sc.nextInt(); // 判断hurt是否为正数，正确。负数，重复输入hurt

      // 3. 计算当前血量
      life = life - hurt;

      // 游戏人物不会死亡，最少1点血

      if(life <= 0){
          life = 1;
      }       
      System.out.println("当前游戏人物的血量是：" + life);

      // 4. 键盘输入一个值，表示技能恢复的血量
      System.out.println("请输入技能恢复值:");
      int recover = sc.nextInt(); // 技能恢复值是否为正数，正确。负数，重复输入recover

      // 5. 计算技能恢复后的血量
      life = life + recover;

      if(life > 200){
        life = 200;
      }

      System.out.println("技能恢复后的血量是：" + life); 

    }
}
