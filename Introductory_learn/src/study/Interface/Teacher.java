package study.Interface;


/*
implements:实现的意思
    //interface：使用interface定义接口
    //implements：使用implements实现接口
 */
public class Teacher implements Introductory_learn.src.study.Interface.Worker {

    @Override
    public void work() {
        System.out.println("教书育人");
    }

    public static void main(String[] args) {
        System.out.println(Introductory_learn.src.study.Interface.Worker.title);
    }
}
