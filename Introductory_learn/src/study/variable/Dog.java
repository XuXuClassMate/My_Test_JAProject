package study.variable;
/**
 * 变量：
 *      1、成员变量：类中，方法外，和方法同一个层级定义的属性叫成员变量
 *      2、局部变量：类中，方法内，定义的属性叫局部变量
 */
public class Dog {
    //私有定义：私有属性
    private String colors; //颜色
    private int age; //年龄
    private String name; //名字
    public Dog(){}
    public Dog(String colors, int age, String name) {
        this.colors = colors;
        this.age = age;
        this.name = name;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void eat() {
    }

    public void run() {
    }
}