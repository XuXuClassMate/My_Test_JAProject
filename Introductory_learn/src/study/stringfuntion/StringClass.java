package Introductory_learn.src.study.stringfuntion;

public class StringClass {
    public static void main(String[] args) {
        System.out.println("StringClass studying");
        String string1 = new String("hahaha");
        System.out.println(string1);
        String string2 = new String("abc");
        String string3 = new String("abc");
        System.out.println(string2.equals(string3)); //true
        System.out.println(string2 == string3); //false

        char[] list1 = {'a', 'b', 'c'};
        String s5 = new String(list1);  //abc
        System.out.println(s5);
    }
}
