package com.problem;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("to off the calculator enter X or x");
        int ans =0 , num1 =0 , num2 =0 ;
        Scanner sc =new Scanner(System.in);
        char op ;
        while(true){

            System.out.println("Enter operation : ");
            op = sc.next().trim().charAt(0);

            if (op == '+' ||op == '%' ||op == '-' ||op == '*' ||op == '/' ){
                System.out.println("enter two number : ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                if (op == '+'){ans = num1 + num2 ;}
                if (op == '-'){ans = num1 - num2 ;}
                if (op == '%'){ans = num1 % num2 ;}
                if (op == '*'){ans = num1 * num2 ;}
                if (op == '/'){
                    if (num2 != 0){ans = num1 / num2 ;}
                    else {
                        System.out.println("Invalid Operation ");
                        ans = 0 ;
                    }
                }
                    System.out.println("ans is : " + ans );
            } else if (op == 'x' ||op == 'X' ) {
                break;
            }else {
                System.err.println("Invalid Input");
            }

        }
    }
}
