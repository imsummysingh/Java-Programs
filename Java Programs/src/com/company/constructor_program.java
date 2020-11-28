package com.company;

public class constructor_program {
    private int l,b,h;
    public constructor_program() {
        l = 3;
        b = 4;
        h = 5;
        System.out.println("Default Constructor");
        System.out.println("l: "+l+" b: "+b+" h: "+h);
    }
    public constructor_program(int l, int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
        System.out.println("Parameterized Constructor");
        System.out.println("l: "+l+" b: "+b+" h: "+h);
    }

    public static void main(String[] args){
        constructor_program c1 = new constructor_program();
        constructor_program c2 = new constructor_program(1,2,3);
    }
}
