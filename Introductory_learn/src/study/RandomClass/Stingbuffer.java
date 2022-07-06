package Introductory_learn.src.study.RandomClass;

public class Stingbuffer {
    /**
     * Stingbuffer/Stringbuilder(官方建议使用)
     * Stringbuilder：效率高
     * 针对字符串的操作
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Test");
        System.out.println(stringBuilder);
        stringBuilder.append("-test");
        System.out.println(stringBuilder);
        stringBuilder.append("_tesT").append(666);
        //查看字符串容量的方法：capacity
        System.out.println(stringBuilder.capacity());

        System.out.println("=======================================");
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("Test");
        System.out.println(stringBuffer);
        stringBuffer.append("-test");
        System.out.println(stringBuffer);
        stringBuffer.append("_tesT").append(666);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println("=======================================");
        //substring截取字符串 0-7
        String string = stringBuffer.substring(0,7);
        System.out.println(string);

        //delete字符串删除 0-3
        stringBuffer.delete(0,3);
        System.out.println(stringBuffer);

    }
}
