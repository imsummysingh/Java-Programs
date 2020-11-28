package com.company;

interface i1{
    void f1();
}

interface i2{
    void f2();
}

class Int implements i1,i2{
    public void f1(){
        System.out.println("i1 method");
    }

    public void f2(){
        System.out.println("i2 method");
    }

    public void f3(){
        System.out.println("Parent Method");
    }
}

public class interface_program {
    public static void main(String[] Args){
        Int i = new Int();
        i.f1();
        i.f2();
        i.f3();
    }
}
