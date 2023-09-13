package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        //since name is private, we cannot access it directly
        //obj.name = "AccioJob";

        obj.setName("AccioJob");
        System.out.print(obj.getName());
    }
}