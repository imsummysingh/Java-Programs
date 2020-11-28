package com.company;

abstract class Per{
    abstract void show();
}

class Stu extends Per{
    public void show(){
        System.out.println("Abstract Class Method Extended by another class");
    }

}

public class abstract_program {
    public static void main(String[] args){
        Stu s = new Stu();
        s.show();
    }
}
