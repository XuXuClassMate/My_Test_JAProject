package Introductory_learn.src.study.stringfuntion;

import java.util.Objects;

public class First_Tostring {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private  String name;
    private  int age;

    @Override
    public String toString() {
        return "First_Tostring{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //向下转型
       First_Tostring F = (First_Tostring) o;
       if (this.name.equals(F.getName())&& this.age == getAge()){
           return true;
       }
       return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

