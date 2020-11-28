package com.company;

class Example{
    int x;  //instance variable
    private static int y;   //static variable

    public void f1(){
        x=4;
        System.out.println("X in f1: "+x);
    }
    public void f2(){
        x=5;
        System.out.println("X in f2: "+x);
    }
    public static void f3(){
        y=2;
        System.out.println("Static Y in f2: "+y);
    }

    public static void f4(){
        y=3;
        System.out.println("Static Y in f3: "+y);
    }

    static class Test{
        public static String country = "india";
    }
}

public class Static_Program {
    public static void main(String[] args){
        Example e1 = new Example();
        e1.f1();
        e1.f2();
        e1.f3();
        e1.f4();
        Example.f3();
        Example.f4();
        System.out.println(Example.Test.country);

    }
}
