package com.company;
import java.util.*;

public class array1d_program {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your No.s");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array is: ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
