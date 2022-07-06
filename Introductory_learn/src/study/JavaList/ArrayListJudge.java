package Introductory_learn.src.study.JavaList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJudge {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        //contains判断值是否在这个列表中
        boolean now = list1.contains("张三");
        System.out.println("这个集合是否存在张三："+ now);

        boolean now1 = list1.contains("小强");
        System.out.println("这个集合是否存在小强："+ now1);

        //元素出现的第一次索引
        int index = list1.indexOf("张三");
        System.out.println(index);


        boolean empty= list1.isEmpty();
        System.out.println("list1是否为空：" + empty);

        //元素清空
        list1.clear();

        boolean empty1= list1.isEmpty();
        System.out.println("list1是否为空：" + empty1);

        //元素出现的第一次索引,不存在为-1
        int index1 = list1.indexOf("张三");
        System.out.println(index1);


    }
}
