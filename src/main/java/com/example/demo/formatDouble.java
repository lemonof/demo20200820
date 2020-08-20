package com.example.demo;

import java.text.DecimalFormat;
/*
数据格式化
 */
public class formatDouble {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        float a = 0.3450f;
        float b = 0.0123f;
        float c = 3.001234f;
        String d=decimalFormat.format(a);
        String e=decimalFormat.format(b);
        String f=decimalFormat.format(c);
        System.out.println(d);//0.34
        System.out.println(e);//0.01
        System.out.println(f);//3
    }

    /*
    去除数值小数位后面的零
     */
    public static String ClearZero(String fromat,String munber){
        DecimalFormat decimalFormat = new DecimalFormat(fromat);//DecimalFormat("###.##"
        Double d = Double.valueOf(munber);
        return decimalFormat.format(d);
    }

}
