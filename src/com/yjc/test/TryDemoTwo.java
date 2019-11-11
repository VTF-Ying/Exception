package com.yjc.test;

import java.util.Scanner;

public class TryDemoTwo {
    public static void main(String[] args) {
        int result=test();
        System.out.println("one和two的商是:"+result);
    }
    public static int test(){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====运算开始=====");
        try {
            System.out.print("输入第一个整数:");
            int one=sc.nextInt();
            System.out.print("输入第二个整数:");
            int two=sc.nextInt();
            return one/two;
        }catch (ArithmeticException e){
            System.out.println("除数不允许为零～～～～～");
            return 0;
        }finally {
            System.out.println("=====运算结束=====");
           // return -100000;    //不推荐在finally里写return
        }
    }
}

