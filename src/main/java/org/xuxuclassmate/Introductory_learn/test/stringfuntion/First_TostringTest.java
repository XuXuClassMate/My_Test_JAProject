package Introductory_learn.test.stringfuntion;


import Introductory_learn.src.study.stringfuntion.First_Tostring;

public class First_TostringTest {
    public static void main(String[] args) {
        First_Tostring Tostring1 = new First_Tostring();
        Tostring1.setAge(20);
        Tostring1.setName("XuXu");
        System.out.println(Tostring1.getAge());
        System.out.println(Tostring1.getName());
        System.out.println(Tostring1.hashCode());//返回对象的哈希码值(HASH算法)
        System.out.println(Tostring1.toString());


        First_Tostring Tostring2 = new First_Tostring();
        Tostring2.setAge(20);
        Tostring2.setName("XuXu");
        /**
         *  == 比较基本类型的时候，是比较值的大小，比较引用数据类型的时候比较的是地址值
         *  equals 比较两个对象值是否相同，默认情况下比较的也是地址值是否相同
         *          如果想要比较对象内容，需要重写equals,自己进行内容的判断
         */
        System.out.println(Tostring1 == Tostring2 );  //false
        System.out.println(Tostring1.equals(Tostring2)); // true
        //获取对象的字节码文件对象
        System.out.println(Tostring2.getClass());
    }

}