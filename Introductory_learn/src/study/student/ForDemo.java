package Introductory_learn.src.study.student;

public class ForDemo {
    public static void main(String[] args) {
        //打印1-10
//        for (int i = 1; i<=10; i++){
//            System.out.println(i);
//        }
        //求1-100的和；
        int sum = 0;
        for (int a = 1; a <= 100; a++) {
            sum += a;

        }
        System.out.println(sum);
        //数组遍历
        String[] names = {"aa","bb","cc"};
//        for (int i = 0;i<names.length;i++){
//            System.out.println(names[i]);
//        }
        //增强for循环
        for(String name:names){
            System.out.println(name);
        }
        //DEMO
        //遇见2跳过
        for(int i=1 ;i<=5;i++){
            if (i == 2){
                continue;
            }
            System.out.println(i);
        }
        //遇见3退出
        for(int i=1 ;i<=5;i++){
            if (i == 3){
                break;
            }
            System.out.println(i);
        }
        //嵌套循环
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=====================");
        /*
        打印出一个雪树
              *
             * *
            * * *
           * * * *
          * * * * *
         * * * * * *
         */
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

