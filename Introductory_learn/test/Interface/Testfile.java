package Interface;

import Introductory_learn.src.study.Interface.Worker;
import study.Interface.Doctor;
import study.Interface.Teacher;
import study.Interface.Tester;

public class Testfile {
    public void ShowWork(Worker worker){
        worker.work();
    }

    public static void main(String[] args) {
        //首先对核心接口进行实例化
        Tester tester = new Tester();
        Teacher teacher = new Teacher();
        Doctor docter = new Doctor();
        //然后对测试类进行实例化
        Testfile testfile = new Testfile();
        //使用测试类对上面实例化进行调用
        testfile.ShowWork(tester);
        testfile.ShowWork(teacher);
        testfile.ShowWork(docter);

    }
}
