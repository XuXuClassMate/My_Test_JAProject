package Introductory_learn.src.study.RandomClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass {
    public static void main(String[] args) throws ParseException {
        Date data = new Date();
        System.out.println(data);
        //格式化的输出规则：yyyy/MM/DD hh:mm:ss
        SimpleDateFormat datatimeFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        //打印格式化日期
        //format格式化
        String dateFormat=datatimeFormat.format(data);
        System.out.println(dateFormat);

        /*
         * 反向解析设置好的日期
         * 返回初始化数据，反向格式化：解析 parse
         */
        Date newdatatimeFormat=datatimeFormat.parse(dateFormat);

        System.out.println(newdatatimeFormat);
    }
}
