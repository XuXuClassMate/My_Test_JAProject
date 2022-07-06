package Introductory_learn.src.study.student;

/*
JAVA的三大特性：
    1、封装:增加可读性和维护性
    2、继承：继承具有传递性
        注：子类不能继承private属性的成员
        java是单继承，只能同时继承一个类
        创建子类对象之前会先初始化父类对象
    3、多态：
 */
public class Characteristic extends Calculator{

    public void SetAge(int age){
        System.out.println(age);
    }
    //继承方法重写
    //定义自己特有的方法
    @Override
    public double Add(double a, double b) {
        return a-b;
    }

    @Override
    public double Subtract(double a, double b) {
        //super是父类对象的引用用，this是本类对象的引用
        // return super.Subtract(a,b);
        return a*b;
    }

    public void One(){
        System.out.println("本类独有啊~");
    }

//    public static void main(String[] args) {
//        Characteristic man = new Characteristic();
//        man.SetAge(5);
//        System.out.println(man.Add(1,2));
//        System.out.println(man.Subtract(1,2));
//
//    }

    public static void main(String[] args) {
        //多态之类型强制转换
        /*
        1、对子类进行实例化、父类来承接
        2、再次自己累实例化，子类强制转给新变量
        3、新变量可同事调用父类和子类方法
        */
        Calculator calculator1 = new Characteristic();
        Characteristic calculator2 = (Characteristic) calculator1;
        calculator2.One();
    }
}