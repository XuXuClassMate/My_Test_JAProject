package Introductory_learn.src.study.student;

public class Calculator {
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

    public static void main(String[] args) {
        Calculator results = new Calculator();
        double results_Add = results.Add(1,2);
        double results_Subtract = results.Subtract(1,2);
        double results_Multiply = results.Multiply(1,2);
        double results_Divide = results.Divide(1,2);
        System.out.println("results_Add："+results_Add+" results_Subtract："+results_Subtract+
                " results_Multiply："+results_Multiply+" results_Divide："+results_Divide);
    }
}
