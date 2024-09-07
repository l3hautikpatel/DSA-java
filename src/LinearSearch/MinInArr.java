package LinearSearch;

import java.util.Arrays;

public class MinInArr {
    static int minArr(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    static int[] arr2dsearch(int[][] arr , int find){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == find)return new int[] {i , j};
            }
        }
        return new int[] {-1 , -1};
    }


    static int maxwealth(int[][] arr){
        int t =0 ;
        int h = 0 ;
        for (int i =0 ; i<arr.length ; i++){
            h = 0;
            for (int j = 0  ; j<arr[i].length ; j++){
                h = h + arr[i][j];
            }
            if (h>t)t=h;
        }
        return t;
    }



    public static void main(String[] args) {
        int[] arr = new int[10];
        arr = new int[]{1, 2, 3, 4,-20};
        System.out.println(minArr(arr));


        int[][] arr2d  = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(arr2dsearch(arr2d , 060)));
        System.out.println(maxwealth(arr2d));
    }
}
