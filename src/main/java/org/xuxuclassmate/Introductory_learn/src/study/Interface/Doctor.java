package Introductory_learn.src.study.Interface;
/*
实现类：医生
interface：使用interface定义接口
implements：使用implements实现接口
 */

public class Doctor implements Worker{
    @Override
    public void work() {
        System.out.println("治病");
    }
}
