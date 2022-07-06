package Introductory_learn.src.study.student;

public class IfDemo {
    public static void main(String[] args) {
        int score = 59;
        if (score>=90){
            System.out.println("你的成绩是 "+score+" 分，成绩优秀");
        }else if (score>=75){
            System.out.println("你的成绩是 "+score+" 分，成绩良好");
        }else if (score>=60){
            System.out.println("你的成绩是 "+score+" 分，成绩合格");
        }else {
            System.out.println("你的成绩是 "+score+" 分，成绩不合格，请联系家长，对于这次教育事故我要甩锅");
        }
    }
}
