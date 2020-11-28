package com.company;

class P{
    public P(){
        System.out.println("Parent constructor P");
    }
}

class C extends P{
    public C(){
        this(2);
        System.out.println("Child Default Constructor C");
    }
    public C(int k){
        System.out.println("Child Parameterized Constructor C");
    }
}

public class constructorChaining_Program {
    public static void main(String[] args){
        C c = new C();
    }
}
