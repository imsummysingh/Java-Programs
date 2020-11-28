package com.company;

class Parent{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return(age);
    }
    public String getName(){
        return(name);
    }
}

class Child extends Parent{
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return(age);
    }
}

public class overriding_program {
    public static void main(String[] args){
        Child c = new Child();
        c.setAge(24);
        System.out.println("Age is: "+c.getAge());
    }
}
