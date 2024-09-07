package sort;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

        int[] arr = {10,5,7,51,21,68,4,84,531,-234};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] n){

        for(int i = 0 ; i < n.length - 1 ; i++) {
            for(int j = i+1 ; j > 0 ; j--){
                if(n[j] < n[j-1]){
                    int temp = n[j];
                    n[j] = n[j-1];
                    n[j-1] = temp ;
                }
                else break;
            }
        }

        return n;
    }



}
