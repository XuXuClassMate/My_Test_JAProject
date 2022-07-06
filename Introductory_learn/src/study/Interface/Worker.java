package Introductory_learn.src.study.Interface;
/*
    工作：抽象的方法(未实现的方法)
    interface：使用interface定义接口
    implements：使用implements实现接口
    abstract：(默认使用abstract类型)
     */
/*
接口解决的问题：
    1、解决类型耦合的问题
    2、代码更方便维护
    3、提高了程序的扩展能力
 */
public interface Worker {
    public abstract void work();
    /*
    abstract：(默认使用abstract类型)，适应static、final进行修饰
    static：静态值，不依赖
    final:最终这个值不能变更
     */
    public static final String title = "工人";
}

