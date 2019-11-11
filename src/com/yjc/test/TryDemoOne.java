package com.yjc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {
    public static void main(String[] args) {
      /*  // 要求:定义两个整数,输出两数之商

        int one = 12;
        int two = 2;
        System.out.println("one和two的商是:"+(one/two));
       */

        //要求:定义两个整数,接收用户的键盘输入，输出两数之商

        Scanner sc=new Scanner(System.in);
        System.out.println("=====运算开始=====");
        try {
        System.out.print("输入第一个整数:");
        int one=sc.nextInt();
        System.out.print("输入第二个整数:");
        int two=sc.nextInt();
        System.out.println("one和two的商是:"+(one/two));
        }catch (ArithmeticException e){
            System.exit(2);  //无条件终止程序运行
            System.out.println("除数不允许为零～～～～～");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("请输入整数～～～～～");
            e.printStackTrace();
        }catch (Exception e){
            //这个Exception 是为了处理前面两个catch块没有捕获的异常  一定要放最后面
            System.out.println("出错了～～～～");
            e.printStackTrace();
        }finally {
            System.out.println("=====运算结束=====");
        }
    }
}
