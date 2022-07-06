package Introductory_learn.src.study.JavaSet;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        //新建TreeSet
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(10);
        treeSet.add(8);
        treeSet.add(6);
        treeSet.add(20);

        System.out.println("treeSet： " + treeSet);

        //可以将元素迭代出来
        for (Integer num:treeSet) {
            System.out.println("treeSet的迭代数据： "+ num);
        }

        //字符串也可进行排序，顺序是按照abcd.....
        TreeSet<String> treeSet2=new TreeSet<>();
        treeSet2.add("我是");
        treeSet2.add("王");
        treeSet2.add("大锤");

        //可以将元素迭代出来
        for (String str:treeSet2) {
            System.out.println("treeSet2的迭代数据： "+ str);
        }


    }
}
