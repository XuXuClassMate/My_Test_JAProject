package Abstract;

import study.Abstract.Docter;
import study.Abstract.Teacher;
import study.Abstract.Tester;
import study.Abstract.Worker;

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
