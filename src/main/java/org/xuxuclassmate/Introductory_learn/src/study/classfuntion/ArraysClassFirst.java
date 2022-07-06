package Introductory_learn.src.study.classfuntion;

import java.util.Arrays;

public class ArraysClassFirst {
    public static void main(String[] args) {
        //数组的定义和操作
        int[] array = new int[3];
        System.out.println(array[0]);
        array[0] = 5;
        System.out.println(array[0]);

        int[] arr = {1, 15, 3, 0, 5, 6, 7, 8};

        //遍历arr列表
        System.out.println(arr[1]);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        /**
         * //二分查找
         * 调用Arrays.binarySearch方法，
         *  1、如果有会返回查找值的下标
         *   2、如果没有会返回一个负值
         */
        int a = Arrays.binarySearch(arr, 5);
        System.out.println(a);

        int b = Arrays.binarySearch(arr, 9);
        System.out.println(b);

        //冒泡排序 sort
        Arrays.sort(arr);
        //冒泡后遍历查看数据
        System.out.println(arr[1]);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        //数组转为字符串表示形式
        String string = Arrays.toString(arr);
        System.out.println(string);
        
    }
}
