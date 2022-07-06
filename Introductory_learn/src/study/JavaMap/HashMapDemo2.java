package Introductory_learn.src.study.JavaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //添加元素
        map.put("name", "XuXu");
        map.put("address", "北京");
        map.put("age", "25");
        System.out.println(map);

        //遍历集合，不能根据索引进行遍历，根据迭代器进行遍历，foreach循环
        //第一种遍历方式，遍历key的几个，根基key获取value
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            //根据key获取value
            String value = map.get(key);
            System.out.println("key:" + key + ", value:" + value);
        }
        //第二种遍历方式，认为key和value是一个整体，获取整体的关系
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //根据entry获取key和value
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
    }
}
