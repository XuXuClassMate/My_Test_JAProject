package Introductory_learn.src.study.RandomClass;

import java.util.Random;

public class RandomClass {
    /**
     * Random class
     * 用于生成随机数
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        //获取一个随机整数
        int i = random.nextInt();
        System.out.println(i);
        //abs取绝对值
        System.out.println(Math.abs(i));
        //获取多少值以内的随机数
        int x = random.nextInt(10);
        System.out.println(x);
        //获取随机boolean类型值
        boolean y = random.nextBoolean();
        System.out.println(y);

        //指定种子
        Random random1=new Random(100);

    }
}
