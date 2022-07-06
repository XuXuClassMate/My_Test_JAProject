package Introductory_learn.src.study.student;

import java.util.Arrays;

public class first {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println((a>b)& (++b<c));
        //当&两边同位真，返回为真，两边一边为假，返回为假
        System.out.println(b);
        //打印出b的值
        a+=1;
        System.out.println(a);
        a%=1;
        System.out.println(a); //取余为0
        // #三目运算符A？B:C -->A,B,C依次为表达式，A是条件表达式，经过运算得到一个Bool类型的值
        //如果值为True，就会执行B，否则执行C表达式
        System.out.println((a>b)?"大于":"小于");
        /*
        ##数据类型：
        #逻辑类型：：
        boolean 布尔类型：取值范围：True/False
        #整型（整数）
        byte:字节型 取值范围：-128~127
        short：短整型 取值范围：-32768~32767
        int：整型  取值范围：-2147483648 ~ 2147483647
        long：长整型： -9223372036854775808 ~ 9223372036854775807
        #浮点型（小数）：
        float：单精确度的浮点型：1.4E-45 ~ 3.4028235E38
        double：双精确度的浮点型： 4.9E-324 ~ 1.7976931348623157E308
        # 字符串：
        char ：char类型的变量，赋值的时候数据长度只能是一位，并且需要""抱起来
        * */
        //ps
        /*
        1、首先是整型
        int和long只能写10个数字，short只能写5个数字，多了就会报错。
        2、其次浮点
        float的小数点后6位，double的小数点后16位。
        https://blog.csdn.net/qfikh/article/details/52832087
        */
        /*
        数组：
        一维数组容量4个数据
         */
        int [] list1 = new int[4];
        /*
        定义一个数组，保存这已知的三个名字：张三、李四、王五
         */
        String [] list2 = {"张三","李四","王五"};
        /*
        二位数组
         */
        String [] [] list3 = new String[4][3]; //二维数组，4行3列
        String[][] list4 = {{"zhangsan", "张三"},{"lisi","李四","王五"}};
        System.out.println(list4[0][0]); //zhangsan
        System.out.println("=============");
        list4[0][0] = "卷起来";
        System.out.println(list4[0][0]);
    }
}
