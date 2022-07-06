package Introductory_learn.src.study.RandomClass;

import java.time.Instant;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); //Mon Mar 28 21:19:20 CST 2022
        //获取当前的时间戳。方法一：
        long times = date.getTime();
        System.out.println(times);
        //设置时间戳
        date.setTime(1648473699464l);
        System.out.println(date.getTime());

        //获取当前的时间戳。方法二：
        long time = System.currentTimeMillis();
        System.out.println(time);

    }
}
