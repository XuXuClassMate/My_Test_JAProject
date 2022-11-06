package study.Abstract;

public class Teacher extends Worker{
    @Override
    public void work(Worker worker) {
        System.out.println("教书育人");
    }

}
