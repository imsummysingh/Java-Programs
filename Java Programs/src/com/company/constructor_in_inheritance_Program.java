package com.company;

class A2{
    int a;
    public A2(int x){
        a=x;
        System.out.println("Parent Constructor");
        System.out.println("A:"+a);
    }
}

class B2 extends A2{
    int b;
    public B2(){
       super(4);
       System.out.println("Child Constructor");
    }
}

public class constructor_in_inheritance_Program {
    public static void main(String[] a){
        B2 b = new B2();
    }
}
