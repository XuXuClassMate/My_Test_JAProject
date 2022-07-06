package Introductory_learn.src.study.JavaList;

import java.util.LinkedList;

public class LinkedListPerson {
    public static void main(String[] args) {
        //创建集合
        LinkedList<Person> peoplelists =new LinkedList<>();
        //给集合添加参数
        Person p1=new Person("张三","男",18);
        Person p2=new Person("李四","女",20);
        Person p3=new Person("王五","男",22);

        peoplelists.add(p1);
        peoplelists.add(p2);
        peoplelists.add(p3);

        System.out.println(peoplelists);

        //遍历当前所有对象信息
        for (Person people:peoplelists){
            System.out.println(people.getName()+"------"+people.getAge()+"----------" +people.getSex());
        }
        //删除某个数据
        peoplelists.remove(0);

        System.out.println("=======================================================================");
        //修改数据
        Person person=peoplelists.get(0);
        person.setName("王大锤");
        person.setAge(55);

        for (Person people:peoplelists){
            System.out.println(people.getName()+"------"+people.getAge()+"----------" +people.getSex());
        }

        //是否包含某个名称
        boolean now=peoplelists.contains(p2);
        System.out.println("是否包含p2这条数据："+now);

        //增强型for循环，判断是否姓名有叫王五的人
        boolean fase = false;
        for (Person people:peoplelists){
            if (people.getName().equals("哈哈")){
               System.out.println(people);
                fase = true;
            }

        }
        if (!fase){
            System.out.println("没有你要找的那个人");
        }








    }
}
