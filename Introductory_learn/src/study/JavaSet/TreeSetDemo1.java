package Introductory_learn.src.study.JavaSet;

public class TreeSetDemo1 implements Comparable<TreeSetDemo1>{
    private String name;
    private int age;
    private int score;

    public TreeSetDemo1() {
    }

    public TreeSetDemo1(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName1() {
        return name;
    }

    public void setName1(String name1) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //实现排序的函数
    @Override
    public int compareTo(TreeSetDemo1 o) {
        /*
         * return 0;
         *      0表示元素一样，如果一样的话，往TreeSet中会添加失败。
         * return 1;
         *      1表示从小到大排序
         * return -1;
         *      -1表示从大到小排序
         */
        //按照年龄从小到大进行排序
//        if(this.getAge()>= o.getAge()){
//            return 1;
//        }
//        else{
//            return -1;
//        }
        //按照年龄从大到小进行排序
//        if(this.getAge() <= o.getAge()){
//            return 1;
//        }
//        else{
//            return -1;
//        }
        // return 1;
        //先按照成绩从小到大进行排序，如果成绩一样，在按照年龄从小到大进行排序
        if (this.getScore() > o.getScore()){
            return 1;
        }else if (this.getScore() == o.getScore()){
            if(this.getAge()>= o.getAge()){
            return 1;
            }
            else{
                return -1;
            }
        }else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "TreeSetDemo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
