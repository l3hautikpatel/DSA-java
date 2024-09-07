package sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {5,7,4,6,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] n){

        int i  = 0;



            
    }

    static void swap(int[] n , int i , int c){
        int temp = n[i];
        n[i] = n[c];
        n[c] = temp;
    }
}
