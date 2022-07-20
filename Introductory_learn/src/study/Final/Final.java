package study.Final;
import src.study.variable.Dog;
public class Final {
    public static final int i =10;
    public static int x = 10;

    public static void main(String[] args) {
        System.out.println(x+=1);

        //实例化
        Dog dog = new Dog();
        dog.eat();
        dog.run();


    }


}
