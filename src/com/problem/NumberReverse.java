package com.problem;

import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter Integer");
        int num = sc.nextInt();
        int ans = 0 ,count = 10;

        while(num > 0){
            ans = (num%10) + ans*count ;
            num = num/10;
        }
        System.out.println(ans);

    }

}
