package math;

import java.util.ArrayList;

public class FactorOfNumbers {
    public static void main(String[] args) {
        int num = 20 ;
        factor1(num);
        System.out.println();
        factor2(num);
        System.out.println();
        factor3(num);
    }

    static void factor1(int n){
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0) System.out.print( i +", ");
        }
    }

    static void factor2(int n){
        for(int i = 1 ; i <  Math.sqrt(n); i++){
            if(n%i == 0){
                if(n/i == i){
                    System.out.print( i +", ");
                }
                else System.out.print( i + ", " + n/i + ", ");
            }
        }
    }

    static void factor3(int n){
        ArrayList<Integer> last = new ArrayList<>();
        for(int i = 1 ; i <  Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print( i+ ", ");
                if(n/i != i){
                    last.add(n/i);
                }

            }
        }
        for(int i = last.size()-1 ; i >= 0 ; i--){
            System.out.print(last.get(i) + ", ");
        }
    }


}
