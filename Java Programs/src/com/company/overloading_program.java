package com.company;

class Person1{
    private int l,b,h,r;

    public void Area(int l,int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
        int area = l*b*h;
        System.out.println("Area for Quadrilateral");
        System.out.println("l: "+l+" b: "+b+" h: "+h);
        System.out.println("Area is: "+area);
    }
    public void Area(int r) {
        this.r = r;
        double area = 3.14*r*r;
        System.out.println("Area for Circle");
        System.out.println("r: "+r);
        System.out.println("Area is: "+area);
    }

}

public class overloading_program {
    public static void main(String[] args){
        Person1 p = new Person1();
        p.Area(1,2,3);
        p.Area(5);
    }
}
