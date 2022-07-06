package Introductory_learn.src.study.classfuntion;

public class MathClass {


    public static int getMaxClass(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }


    public static void main(String[] args) {
        int max = getMaxClass(3, 2);
        System.out.println(max);

        //Math方法：
        /**
         * int max(int a,int b) ：返回两个数中的较大值
         * int min(int a,int b) : 返回两个数中的最小值
         * int abs(int a : 返回参数的绝对值
         * int ceil(double a) : 向上取整
         * int floor(double a) : 向下取整
         * double sqrt(double a) : 开平方
         * int round(double a) : 四舍五入
         */
        System.out.println("int max(int a,int b) ：返回两个数中的较大值");
        System.out.println(Math.max(1, 4));
        System.out.println("int min(int a,int b) : 返回两个数中的最小值");
        System.out.println(Math.min(4, 3));
        System.out.println("int abs(int a : 返回参数的绝对值");
        System.out.println(Math.abs(-10));
        System.out.println("int ceil(double a) : 向上取整");
        System.out.println(Math.ceil(0.03));
        System.out.println("int floor(double a) : 向下取整");
        System.out.println(Math.floor(4.78));
        System.out.println("double sqrt(double a) : 开平方");
        System.out.println(Math.sqrt(9));
        System.out.println("int round(double a) : 四舍五入");
        System.out.println(Math.round(4.46));
        System.out.println("int round(double a) : 四舍五入");
        System.out.println(Math.round(4.6));
    }
}
