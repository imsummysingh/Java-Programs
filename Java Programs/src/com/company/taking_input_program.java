package com.company;
import java.util.*;

public class taking_input_program {
    public static void main(String[] args){
        System.out.println("Enter your Name and Age");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Your Name and Age is:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }
}
