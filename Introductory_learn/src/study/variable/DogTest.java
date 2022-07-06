package Introductory_learn.src.study.variable;

class DogTest {

    @org.junit.jupiter.api.Test
    void getColors() {

    }

    @org.junit.jupiter.api.Test
    void setColors() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog("黑色",2,"小黑");
        System.out.println(dog.getName());
        dog.setName("小黄");
        System.out.println(dog.getName());
        Dog dog1 = new Dog();
        System.out.println(dog1.getName());
        dog1.setName("花花");
        System.out.println(dog1.getName());
    }
}