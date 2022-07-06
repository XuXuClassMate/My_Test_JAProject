package Introductory_learn.src.study.student;


public class WhileDemo {
    public static void main(String[] args){
        //顺序执行，满足while条件会继续执行，不满足停止
        int x = -1;
        do{
            System.out.println(x);
            x++;
        }while (x>=0 &&x<=5);
        System.out.println("=======");
        System.out.println(x);
        /*
        switch语句接收到 变量类型有限，只支持char、byte、short、int、String、enum
        // 根据数值返回
         */
        int mouth = 6;
        switch (mouth){
            //满足那个条件会从哪个条件开始向后执行
            case 1:
                System.out.println("小可爱");
            case 6:
                System.out.println("小憨憨");
            case 9:
                System.out.println("冰墩墩");
            //无法匹配以后所有条件的兜底条件
            default:
                System.out.println("傻憨憨");
                break;

        }

    }
}
