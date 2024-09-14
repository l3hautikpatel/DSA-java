package sort;

import java.util.Arrays;

public class SelectionSortRecoursion {
    public static void main(String[] args) {
        int[] arr = {10,5,7,51,21,68,4,84,531};
        sort(arr , arr.length  , 0 ,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr , int r , int c , int max){
        if(r == 1) return;
        if(c < r){
            if(arr[c] > arr[max]){
                sort(arr , r, c+1 , c);
            }
            else sort(arr, r, c+1 , max);
        }
        else {
            int temp = arr[max];
            arr[max] = arr [r -1];
            arr[r-1] = temp;

            sort(arr ,r-1, 0,0);
        }
    }
}
