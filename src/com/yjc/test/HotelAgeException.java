package com.yjc.test;

public class HotelAgeException extends Exception {
    public HotelAgeException(){
        super("18岁以下，80岁以上住客必须由亲友陪同");
    }
}
