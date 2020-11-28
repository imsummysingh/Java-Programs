package com.company;

//function hiding

class A1{
    public static void f1(){
        System.out.println("Static A");
    }
}

class B1 extends A1{
    public static void f1(){
        System.out.println("Static B");
    }
}

public class staticMember_in_inheritance_Program {
    public static void main(String[] Args){
        //B1 b = new B1();
        B1.f1();
    }
}
