package com.problem;

import java.util.Scanner;

public class NumCounter {
    public static void main(String[] args) {
        System.out.println("give me a long number ");
        Scanner sc =new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println("which num you want to count");
        int cn = sc.nextInt() ;
        int count = 0 ;
        while (n>0){
            if(n%10 == cn){
                count++;
                n = n/10 ;
            }else {
                n = n/10;
            }
        }
        System.out.println("Num \" " + cn + " \" occure  \" " +  count + " \" time  ");
    }
}
