package Introductory_learn.test.Abstract;

import Introductory_learn.src.study.Abstract.Docter;
import Introductory_learn.src.study.Abstract.Teacher;
import Introductory_learn.src.study.Abstract.Tester;
import Introductory_learn.src.study.Abstract.Worker;

public  class Testfile {
    public void ShowDaies(Worker worker){
        worker.work(worker);
    }

    public static void main(String[] args) {
        Worker worker = new Worker() {
            @Override
            public void work(Worker worker1) {
               worker1.work(worker1);

            }
        };


        Testfile testfile = new Testfile();
        Tester tester = new Tester();
        Docter docter =new Docter();
        Teacher teacher = new Teacher();
        testfile.ShowDaies(tester);
        testfile.ShowDaies(docter);
        testfile.ShowDaies(teacher);
        worker.ShowDay(tester);
        System.out.println("==============");
        worker.ShowDay(docter);

    }



}
