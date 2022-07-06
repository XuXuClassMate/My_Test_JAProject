package Introductory_learn.src.study.JavaList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOperation {
    public static void main(String[] args) {
        //面向对象中的多态，父类的引用指向子类的对象
        List<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        System.out.println(list1);
        //修改元素
        list1.set(0, "赵⑦");
        System.out.println(list1);

        //获取元素(单个获取)
        String inde=list1.get(0);
        System.out.println("inde"+inde);

        //循环遍历list1.size()获取集合的长度，== length funtion
        for (int i = 0; i <= list1.size()-1; i++) {
            System.out.println(list1.get(i));
        }

        int j=0;
        while (j<= list1.size()-1){
            System.out.println(list1.get(j));
            j++;
        }


        System.out.println("=================迭代器功能 start====================");
        //迭代器功能
        //获取迭代器
        Iterator<String> iterator=list1.iterator();
        //判断是否有下一个元素，如果有，就打印
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=================迭代器功能 end====================");

        //增强for循环(高级for循环)底层原理就是迭代器原理
        //但是迭代过程中不能修改删除元素，会报错：并发修改异常
        for(String list:list1){
            System.out.println(list);
        }


        //删除元素
        list1.remove("李四");
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);

        //清空元素
        list1.clear();
        System.out.println(list1);



    }
}
