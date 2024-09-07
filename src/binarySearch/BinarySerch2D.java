package binarySearch;

import java.sql.Array;
import java.util.Arrays;

public class BinarySerch2D {
    public static void main(String[] args) {
        int[][] array  = {
                {10,20,30,40,50},
                {12,23,34,55,56},
                {13,34,45,56,78},
                {14,35,67,68,79}
        };

        System.out.println(Arrays.toString(search(array , 45)));
    }

     static int[] search(int[][] arr , int n ){
        int r = 0 ;
        int c = arr.length - 1;
        while(r < arr.length && c>=0 ){
            if(arr[r][c] == n) {
                return new int[]{r,c} ;
            }
            if(arr[r][c] < n ) r++;
            else c--;
        }
        return new int[]{-1, -1};
     }
}
