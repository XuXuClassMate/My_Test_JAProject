package Introductory_learn.src.study.JavaSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        //list 有序,并且运行元素重复
        List<String> list = new ArrayList<>();
        list.add("哈哈哈");
        list.add("嘿嘿嘿");
        list.add("哈哈哈");
        System.out.println(list);

        //set,无序，不允许元素重复
        Set<String> set1 = new java.util.HashSet<>();
        set1.add("嘿嘿嘿");
        set1.add("哈哈哈");
        set1.add("哈哈哈");
        set1.add("吼吼吼");

        System.out.println(set1);
    }
}
