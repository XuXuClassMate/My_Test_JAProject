package Introductory_learn.src.study.JavaList;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("哈哈");
        linkedList.add("嘿嘿");
        linkedList.add("呵呵");
        //LinkedList方法要不ArrayList多一些
        //获取第一个元素
        String First = linkedList.getFirst();
        System.out.println("第一个元素："+First);
        //获取最后一个元素
        String Last = linkedList.getLast();
        System.out.println(Last);

        //删除最上面的元素 pop
        String pop = linkedList.pop();
        System.out.println(pop);
        System.out.println(linkedList);

    }
}
