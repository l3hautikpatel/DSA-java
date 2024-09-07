package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,5,7,51,21,68,4,84,531};
        System.out.println(Arrays.toString(sort(arr)));

    }


    public static int[] sort(int[] n){

        for(int i = 0 ; i < n.length ; i++ ){
            int min = i ;
            for(int j = i ; j<n.length;j++){
                if(n[min] > n[j]) min = j ;
            }
            int temp = n[i];
            n[i] = n[min];
            n[min] = temp;
        }

        return n ;
    }
}
