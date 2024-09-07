package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,5,7,51,21,68,4,84,531};
        System.out.println(Arrays.toString(sort(arr)));
    }


    public static int[] sort(int[] n){
        for(int i = 0 ; i <  n.length ; i++){
            for(int j = 1 ; j < n.length - 1 -i ; j++){
                if(n[j] < n[j-1]){
                    int t = n[j];
                    n[j] = n [j - 1];
                    n[j -1 ] = t;
                }
            }
        }
        return n ;
    }












    /*public static int[] sort(int[] n){
        for(int i = 0 ; i <  n.length ; i++){
            for(int j = 0 ; j < n.length  ; j++){
                if(n[i] < n[j]){
                    int t = n[i];
                    n[i] = n [j];
                    n[j] = t;
                }
            }
        }
        return n ;
    }*/








}
