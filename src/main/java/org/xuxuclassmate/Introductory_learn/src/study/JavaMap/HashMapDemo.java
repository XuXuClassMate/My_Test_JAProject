package Introductory_learn.src.study.JavaMap;

import java.util.HashMap;

public class HashMapDemo {
    /**
     * Map
     *    所有的key组成一个Hashset
     *    HashMap：针对的是key底层结构是散列结构，存储的时候更具元素的Hashcode进行存储
     *    存储的时候是key-value
     * TreeMap
     *     可以进行排序，排序方式是根据key进行排序的
     *
     */
    public static void main(String[] args) {
        //基本使用类型
        HashMap<String, String> map = new HashMap<>();
        //添加元素
        map.put("name", "XuXu");
        map.put("address", "北京");
        map.put("age", "25");

        System.out.println(map); //重写了toString方法
        //获取元素，根据key获取value
        String name = map.get("name");
        System.out.println("map name:" + name);
        String age = map.get("age");
        System.out.println("map age:" + age);
        String address = map.get("address");
        System.out.println("map address:" + address);
        //移出元素
        map.remove("age");
        System.out.println(map);
        //修改元素
        map.replace("address", "l兰州");
        System.out.println(map);
    }
}
