package Introductory_learn.src.study.student;

import java.util.Scanner;
/*
 * 实现可以自由输入的计算器
 * */
public class CalculatorPlus {
    //输入整数A
    public double setnuma(){
        System.out.println("输入第一个数据：");
        Scanner scan = new Scanner(System.in);
        double a = 0;
        if (scan.hasNextDouble()) {
            a = scan.nextDouble();
        }else{
            System.out.println("输入错误：请输入整数");
        }
        return a;
    }
    //输入整数B
    public double setnumb(){
        System.out.println("输入第二个数据：");
        Scanner scan = new Scanner(System.in);
        double b = 0;
        if (scan.hasNextDouble()) {
            b = scan.nextDouble();
        }else{
            System.out.println("输入错误：请输入整数");
        }
        return b;
    }

    //加法运算
    public double Add(double a, double b){
        return a+b;
    }
    //减法运算
    public double Subtract(double a, double b){
        return a-b;
    }
    //乘法运算
    public double Multiply(double a, double b){
        return a*b;
    }
    //除法法运算
    public double Divide(double a, double b){
        return a/b;
    }
    //方法一：
    /*public static void main(String[] args) {
        CalculatorPlus Calculator = new CalculatorPlus();
        double A = Calculator.setnuma();
        double B = Calculator.setnumb();
        CalculatorPlus results = new CalculatorPlus();
        double results_Add = results.Add(A,B);
        double results_Subtract = results.Subtract(A,B);
        double results_Multiply = results.Multiply(A,B);
        double results_Divide = results.Divide(A,B);
        System.out.println("results_Add："+results_Add+" results_Subtract："+results_Subtract+
                " results_Multiply："+results_Multiply+" results_Divide："+results_Divide);
    }*/
    //方法二：
    public static void main(String[] args) {
        //输入功能实例化
        Scanner scanner = new Scanner(System.in);
        //类实例化
        CalculatorPlus Calculator = new CalculatorPlus();
        //输入第一个数据
        System.out.println("输入第一个数据：");
        double a = scanner.nextDouble();
        //输入运算符
        System.out.println("输入运算符：");
        String operator = scanner.next();
        //输入第二个数据
        System.out.println("输入第二个数据：");
        double b = scanner.nextDouble();
        //根据输入的运算符，调用相关的方法完成数据运算
        double result = 0;
        if ("+".equals(operator)){
            result = Calculator.Add(a,b);
        }else if ("-".equals(operator)){
            result = Calculator.Subtract(a,b);
        }else if ("*".equals(operator)){
            result = Calculator.Multiply(a,b);
        }else if ("/".equals(operator)){
            result = Calculator.Divide(a,b);
        }else{
            System.out.println("输入错误：没有此运算符号");
        }
        System.out.println("结果是："+ result);
    }
}
