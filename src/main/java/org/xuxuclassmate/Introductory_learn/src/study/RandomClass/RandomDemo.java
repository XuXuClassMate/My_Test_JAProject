package Introductory_learn.src.study.RandomClass;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        String[] list = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9"};
        //一堆用户，抽出一个一等奖，两个二等奖，三个三等奖
        Random random = new Random();
        int i = random.nextInt(list.length);
        System.out.println(list[i]);
        //使用键盘录入
        Scanner scanner = new Scanner(System.in);
        //循环抽奖的次数，总数6次
        for (int j = 0; j < 7; j++) {
            System.out.println("抽奖活动开始，，请按回车键盘");
            String scan = scanner.next();
            int x = random.nextInt(list.length);
            if (j == 1) {
                System.out.println("一等奖是：" + list[i]);
            } else if (j > 1 && j <= 3) {
                System.out.println("二等奖是：" + list[i]);
            } else if (j > 4 && j <= 6) {
                System.out.println("三等奖是：" + list[i]);
            } else {
                System.out.println("没这个选项");
            }


        }
    }
}
