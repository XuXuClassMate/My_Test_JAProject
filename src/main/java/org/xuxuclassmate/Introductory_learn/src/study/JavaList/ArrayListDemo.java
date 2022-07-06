package Introductory_learn.src.study.JavaList;

/**
 * ArrayList 属于Collection类型类
 * ArrayList 单列集合，可以储存单个对象，底层是数组形式实现。
 *  int [] arr={};
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //定义数组的第一种方式
        int[] arr1 =new int[3];
        //定义数组的第二种方式
        int arr2[] =new int[3];
        //定义数组的第三种方式
        int [] arr3 = new int[]{1,2,3};
        //定义数组的第四种方式
        int[] arr4 = {1,2,3,4,5};
        /*
        ####   栈和堆
        栈：空间小运行效率高
           基本数据类型：
            - int、byte、short、float、double、char、boolean、long、及方法的调用！
        堆：空间大运行效率比栈低
         */
        int [] list1 = {1,3,9,7,4,6,5};
        int a = MaxNum(list1);
        System.out.println(a);
    }

    public static int MaxNum(int[] arr){
        int maxnum = arr[0];
        for (int i =0;i< arr.length-1;i++){
            if (maxnum < arr[i]){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }


}

