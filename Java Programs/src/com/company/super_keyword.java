package com.company;

class A{
    int z;
    public void f1(){
        System.out.println("Hello from Parent");
    }
}

class B extends A{
    int z;
    public void f1(){
        super.f1();
        System.out.println("Hello from Child After Parent Called");
    }
    public void f2(){
        int z;
        z=2;
        this.z=3;
        super.z=4;
        System.out.println("From f2 function z is: "+z);
        System.out.println("From B Class z is: "+this.z);
        System.out.println("From A class z is: "+super.z);
    }
}

public class super_keyword {
    public static void main(String[] args){
        B b = new B();
        b.f1();
        b.f2();
    }
}
