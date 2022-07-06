package Introductory_learn.src.study.JavaList;

import java.util.ArrayList;

public class CollectionClass {
    /**
     * Collection 单列集合
     *      存储单个的对象
     *      list ： 有序集合 -存对象和取对象的顺序是一致的
     *              Arraylist 底层是数组结构 查询效率高，增删效率低
     *              Linkedlist  底层是链表结构,查询效率低，增删效率高
     *
     *      set ： 无序集合 -存对象和取对象的顺序可能是不一致的
     *             HashMap 算法是Hash算法
     *             TreeMap  算法是Tree(二叉树)的算法
     *
     *      常有方法：
     *          增：add -添加一个元素
     *             addAll - 添加多个元素(另外一个集合)
     *          删：clear -清空集合元素
     *              remove -移除某个元素
     *              removeAll -移除某个集合中所有元素
     *          改：
     *                直接赋值
     *          查：iterator-迭代器
     *              size() 返回此集合中的元素数
     *              get(index)
     *          判断：
     *              contains 判断是否包含某个元素
     *              isEmpty 判断集合是否为空
     *              equals 判断
     */
    public static void main(String[] args) {
        //支持任意的引用型类型
        ArrayList<String> arrayList = new ArrayList<>();
        //添加元素
        arrayList.add("张三");
        //打印队列
        System.out.println(arrayList);
        arrayList.add(0, "李四");
        arrayList.add("王五");
        System.out.println(arrayList);

        ArrayList<String> arrayList1 =new ArrayList<>();
        arrayList1.add("小红");
        arrayList1.add("小王");
        System.out.println("arrayList1" + arrayList1);
        arrayList.addAll(arrayList1);
        System.out.println("arrayList"+ arrayList);



    }
}
