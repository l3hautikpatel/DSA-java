package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,4,6,3,2,7,3,6,45,756,4536,768,4353,785,9879,3546,8769553,54654,6589,6768,5,4,58,765,36575,7,36,65,5676,67565,442,53645};
        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(mrege(new int[]{3,4,5,7,8,9,90 } , new int[]{02,5,8,10,34,64,645,74456,345353,34534645,675675675})));
        System.out.println(Arrays.toString(arr));
        inPlaceMergeSort(arr, 0  , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void  inPlaceMergeSort(int[] arr , int s  , int e ){
        if(e - s == 1) return;

        int mid = s + (e-s)/2;

        inPlaceMergeSort(arr, s ,mid);
        inPlaceMergeSort(arr, mid ,e);
        inPlaceMerge(arr, s , mid , e);
    }

    static void inPlaceMerge(int[] arr , int s , int mid , int e){
        int[] mix = new int[e-s];

        int i = s ;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0 ; l < mix.length ; l++){
            arr[s+l] = mix[l];
        }
    }

    static int[] mergeSort(int[] arr){
        if(arr.length <= 1 ) return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));
        return mrege(left , right);
    }

    static int[] mrege(int[] arr1 , int[] arr2){
        int n = arr1.length + arr2.length ;
        int[] newarr = new int[n];

        int n1 = 0 ;
        int n2 = 0 ;
        int index = 0 ;

        while(n1 < arr1.length && n2 < arr2.length){
            if(arr1[n1] < arr2[n2]){
                newarr[index] = arr1[n1];
                n1++;
            }
            else {
                newarr[index] = arr2[n2];
                n2++;
            }
            index++;
        }
        if(n1 < arr1.length){
            while(n1 < arr1.length){
                newarr[index] = arr1[n1];
                n1++;
                index++;
            }
        }else if(n2 < arr2.length){
            while(n2 < arr2.length){
                newarr[index] = arr2[n2];
                n2++;
                index++;
            }
        }



        return newarr;
    }
}
