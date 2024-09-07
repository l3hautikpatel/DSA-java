package com.problem;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {



        System.out.println("Enter Threee Number ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int max ;
        /*
        max = a;
        if (b>max){
            max =b ;
        }
        if (c> max){
            max = c ;
        }
        */

        max = Math.max(c, Math.max(a,b));

        System.out.println("maximum number is :- " + max);

    }
}
