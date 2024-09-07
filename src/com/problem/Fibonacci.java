package com.problem;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter number which you want to know fibonacci Element");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a =0 ,b =1 ,ans = 0 ;

        if(n == 0 || n ==1 ){
            ans = n ;
            System.out.println(n +"  fibonacci number is :- " + ans);
        } else {
            int count =2 , temp =0 ;
            while (count <= n){
                temp = b;
                b = a + b ;
                a = temp;
                count++ ;
            }
            ans = b;
            System.out.println(n +"  fibonacci number is :- " + ans);
        }

    }
}
