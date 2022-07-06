package Introductory_learn.src.study.RandomClass;

import java.util.OptionalInt;

public class IntegerClass {
    public static void main(String[] args) {
        //获取Integer类的属性
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("Max_value：" + maxValue + "   minx_value：" + minValue);

        Integer integer = new Integer(10);
        System.out.println(integer);
        //可以简化integer == integer1，作用相同
        Integer integer1 = 10;
        System.out.println(integer1);
        //拆箱操作
            //将赋值的数据取出来
        int x = integer1.intValue();
        System.out.println(x);
        String y="1000";
        // String->int 类型转换 parseInt
        int y1= Integer.parseInt(y+100);
        String y2=String.valueOf(y1);
        System.out.println(y1);
        System.out.println(y2);

    }
}
