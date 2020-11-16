package com.company;

class Box{
    private int length,breadth,height;
    public void setDimension(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("The Dimensions are:");
        System.out.println("Length is: "+length);
        System.out.println("Breadth is: "+breadth);
        System.out.println("Height is: "+height);
    }
}

public class Class_Object {
    public static void main (String[] args){
        Box b1 = new Box();
        b1.setDimension(2,3,4);
        b1.showDimension();

        Box b2 = new Box();
        b2.setDimension(1,2,3);
        b2.showDimension();
    }
}
