package Introductory_learn.src.study.Abstract;
//abstract抽象类
//抽象方法里面只能定义抽象方法，不能实现，让实现类个性化实现

public abstract class Worker {
    /*
    抽象类也具备普通类的定义方法的作用
     */

    public abstract void work(Worker worker);

    public void ShowDay(Worker worker){
        System.out.println("睁眼,起床，开始卷");
        work(worker);
        System.out.println("累死我了，睡了睡了~，欧 那个耶~~~");
    }



}
