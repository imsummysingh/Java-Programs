package com.company;

class Aa implements Runnable{
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("Thread A: "+i);
        }
    }
}

class Bb implements Runnable{
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("Thread B: "+i);
        }
    }
}

public class thread_program {
    public static void main(String[] args){
        Thread t1= new Thread(new Aa());
        Thread t2 = new Thread(new Bb());
        t1.start();
        t2.start();
    }
}
