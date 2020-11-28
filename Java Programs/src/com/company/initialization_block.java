package com.company;

public class initialization_block {

    private int x;{
        System.out.println("Initialization Block for instance variable");
        x=5;
    }

    private static int y;

    static{
        System.out.println("Initialization Block for static variable");
        y=4;
    }

    public initialization_block(){
        System.out.println("Constructor Block for instance: x="+x);
        System.out.println("Constructor Block for static: y="+y);
    }

    public static void main(String[] args){
        initialization_block i = new initialization_block();
        initialization_block j = new initialization_block();
    }
}
