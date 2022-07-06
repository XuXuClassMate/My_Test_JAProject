package Introductory_learn.src.study.stringfuntion;

import java.io.UnsupportedEncodingException;
import java.nio.charset.CoderMalfunctionError;
import java.util.Locale;

public class StringClass2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string1 = "Hello World!";
        System.out.println(string1.charAt(0));
        System.out.println(string1.charAt(1));

        int first = string1.codePointAt(1);
        System.out.println(first);

        String s2 = "a";
        String s3 = "a";

        System.out.println("s2 equals s3  " + s2.equals(s3));

        System.out.println(s2.compareTo(s3)); //谁调用，如果自己靠前负值。
        System.out.println(s3.compareTo(s2));  //谁调用，如果自己靠后，正值。
        System.out.println("a".compareTo("a")); //谁调用，如果完全一样，为0。
        //字符串拼接concat
        System.out.println("abc".concat("aws"));
        //判断是否包含这个字符串contains
        System.out.println(string1.contains("Hello"));
        System.out.println(string1.contains("hello"));
        //list->string 方法 copyValueOf
        char[] list1 = {'a', 'b', 'c'};
        String string2 = String.copyValueOf(list1);
        System.out.println(string2);
        String s7 = "2570129qq@gmail.com";
        //判断字符串开头的内容：startsWith

        System.out.println(s7.startsWith("257")); //如果是为True

        System.out.println(s7.startsWith("269")); // 如果不是为False
        //判断字符串结尾的内容：endsWith
        System.out.println(s7.endsWith("com")); //如果是为True

        System.out.println(s7.endsWith("net"));   // 如果不是为False
        System.out.println(s7.getBytes("UTF-8"));

        // string select funtion is indexOf(查找字符串对应的位置)
        System.out.println(s7.indexOf("57"));
        System.out.println(s7.indexOf("qq"));
        // 判断字符串是否为空
        String s8 = "";
        System.out.println("s7,s8长度");
        System.out.println(s7.length());
        System.out.println(s8.length());
        System.out.println("s7,s8是否非空");
        System.out.println(s8.isEmpty()); //长度是否为0：isEmpty
        System.out.println(s7.isBlank()); //长度是否空，或者是空字符(无内容)：isBlank

        //字符串替换
        System.out.println(s7.repeat(5));
        System.out.println(s7.replace("qq", "weixin"));
        System.out.println(s7.replace(".", "!"));

        String s9 = "你二大爷，和，他二大爷，都叫，大爷";
        System.out.println(s9.replace("大爷", "**"));
        //分片，按，分片。
        String[] list2 = s9.split("，");
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
        //后边的值会打印：substring，从第二个值后边会打印。
        System.out.println(s9.substring(2));
        //全部转大写toUpperCase
        System.out.println(s7.toUpperCase());
        //全部转小写toLowerCase
        System.out.println(s7.toLowerCase(Locale.ROOT));

        //trim去除前后空格(只能去除前后不能去除中间)
        String string3 = "     Hello World !!!      ";
        System.out.println(string3);
        System.out.println(string3.trim());


    }
}
