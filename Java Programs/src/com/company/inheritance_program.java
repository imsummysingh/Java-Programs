package com.company;

class Person{
    private int age;
    private String name;
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return(age);
    }
    public String getName(){
        return(name);
    }
}

class Student extends Person{
    private int rollNo;
    public void setRollNo(int r){
        rollNo = r;
    }
    public int getRollNo(){
        return(rollNo);
    }
}

public class inheritance_program {
    public static void main(String[] args){
        Student s = new Student();
        s.setRollNo(1);
        s.setAge(24);
        s.setName("Summy");
        System.out.println("Roll No is:"+s.getRollNo());
        System.out.println("Age is:"+s.getAge());
        System.out.println("Name is:"+s.getName());
    }
}
