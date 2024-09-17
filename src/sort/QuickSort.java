package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,4,6,3,2,7,3,6,45,756,4536,768,4353,785,9879,3546,8769553,54654,6589,6768,5,4,58,765,36575,7,36,65,5676,67565,442,53645};

        System.out.println(Arrays.toString(arr));
        quicksort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


    static void quicksort(int[] arr , int low, int high){
        if(low >= high)return;
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while(s<=e){

            while(arr[s] < pivot) s++;
            while(arr[e] > pivot) e--;
            if(s<=e){
                swap(arr, s , e);
                s++;
                e--;
            }

        }
        quicksort(arr , low,e);
        quicksort(arr , s ,high);
    }
    static void swap(int[] arr ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
