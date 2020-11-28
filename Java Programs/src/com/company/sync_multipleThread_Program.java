package com.company;
import java.util.*;
import java.security.PublicKey;

class Account{
    private int bal;
    public Account(int bal){
        this.bal = bal;
    }
    public boolean insufficiant(int w){
        if(bal>w){
            return (true);
        }
        else{
            return (false);
        }
    }

    public void withdraw(int amt){
        bal = bal-amt;
        System.out.println("Withdrawl Money is: "+amt);
        System.out.println("Your current balance is: "+bal);
    }
}

class Customer implements Runnable{
    private Account account;
    private String name;
    public Customer(Account account, String n){
        this.account=account;
        name=n;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println(name+" Enter amount to withdraw");
        int amt = sc.nextInt();

        synchronized(account){
            if(account.insufficiant(amt)){
                System.out.println(name);
                System.out.println(amt);
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
    }
}

public class sync_multipleThread_Program {
    public static void main(String[] args){
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"raj");
        Customer c2 = new Customer(a1,"simran");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
