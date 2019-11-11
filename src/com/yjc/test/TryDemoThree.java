package com.yjc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

    public static void main(String[] args) {
//        try {
//            int result=test();
//            System.out.println("one和two的商是:"+result);
//        } catch (ArithmeticException e) {
//            System.out.println("除数不允许为零");
//            e.printStackTrace();
//        }catch (InputMismatchException e) {
//            System.out.println("请输入整数");
//            e.printStackTrace();
//        }

        try {
            int result=test();
            System.out.println("one和two的商是:"+result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 通过throws抛出异常,正对可能出现多种异常情况，解决方案：
     *                                          1、throws后面接多个异常类型,中间用逗号分隔
     *                                          2、throws后面直接接Exception
     */



//    public static int test() throws ArithmeticException,InputMismatchException {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("=====运算开始=====");
//            System.out.print("输入第一个整数:");
//            int one=sc.nextInt();
//            System.out.print("输入第二个整数:");
//            int two=sc.nextInt();
//            System.out.println("=====运算结束=====");
//            return one/two;
//        }
    public static int test() throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("=====运算开始=====");
        System.out.print("输入第一个整数:");
        int one=sc.nextInt();
        System.out.print("输入第二个整数:");
        int two=sc.nextInt();
        System.out.println("=====运算结束=====");
        return one/two;
    }
}
