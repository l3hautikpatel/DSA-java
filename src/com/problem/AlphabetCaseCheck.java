package com.problem;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {

        System.out.println("enter any charactor");
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <='z'){
            System.out.println("LowerCase");
        }
        else {
            System.out.println("capital latter");
        }


        System.out.println("enter any word");

        int lc =0 ,uc =0  ;
        String str = sc.next();
        for (int i = 0 ; i<str.length() ;i++){
            if (str.trim().charAt(i) >= 'a' && str.trim().charAt(i) <='z'){
                lc++;
            }else{
                uc++;
            }
        }
        if (uc == 1 && lc >= 2){
            System.out.println("CamelCase");
        } else if (uc ==0 && lc >= 1) {
            System.out.println("lowercase");
        }else if (lc ==0 && uc >= 1) {
            System.out.println("UPERCASE");
        }else{
            System.err.println("HARD TO FIND \" Word is mixer of latterCase \" ");
        }


    }
}
