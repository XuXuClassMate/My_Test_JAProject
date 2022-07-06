package Introductory_learn.src.study.JavaSet;

import java.util.TreeSet;

public class TreeSetDemo2 {

    public static void main(String[] args) {
        TreeSet<TreeSetDemo1> setDemo1= new TreeSet<>();
        TreeSetDemo1 setDemo11 = new TreeSetDemo1("张三", 20, 50);
        TreeSetDemo1 setDemo12 = new TreeSetDemo1("李四", 22, 30);
        TreeSetDemo1 setDemo13 = new TreeSetDemo1("王五", 18, 70);
        TreeSetDemo1 setDemo14 = new TreeSetDemo1("赵六", 20, 80);


        setDemo1.add(setDemo11);
        setDemo1.add(setDemo12);
        setDemo1.add(setDemo13);
        setDemo1.add(setDemo14);


        System.out.println(setDemo1);

    }

}
