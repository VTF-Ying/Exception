package com.yjc.test;

import java.util.Scanner;

public class TryDemoFour {
    public static void main(String[] args) {
        try {
            testAge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * throw抛出异常对象的处理方案:
     *     1、通过try...catch包含throw语句 -- 自己抛自己处理
     *     2、通过throws在方法声明出抛出异常类型 -- 谁调用谁处理 -- 调用者可以自己处理 ,也可以继续向上抛，由上层来处理
     * @throws Exception
     */
    //描述酒店的入住规则:限定年龄,18岁以下  80岁以上的住客必须由亲友陪同
    public static void testAge() throws Exception {

        System.out.println("请输入年龄:");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if (age<18 || age>80){
                throw new Exception("18岁以下,80岁以上的住客必须由亲友陪同");
        }else {
            System.out.println("欢迎入住本酒店");
        }
    }
}
