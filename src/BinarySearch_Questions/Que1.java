package BinarySearch_Questions;

public class Que1 {


    static int ceil(int[] arr , int tar){
        if(tar > arr[arr.length-1]) return -1;
        int s = 0 ;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(tar == arr[mid]) return mid;
            if(tar < arr[mid]) e = mid-1;
            else s = mid +1 ;
        }
        return s ;
    }

    static int floor(int[] arr , int tar){
        if(tar < arr[0]) return -1;
        int s = 0 ;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(tar == arr[mid]) return mid;
            if(tar < arr[mid]) e = mid-1;
            else s = mid +1 ;
        }
        return e ;
    }


    public static void main(String[] args) {
        int[] array  = {1,2,10,15,18,19,20,24,25,28,29,30,38,38,39,40,45,48,49,51,56,58,61,63,64,66,69,71,75,78,79,80};
        System.out.println(ceil(array , 16));
        System.out.println(ceil(array , 81));
        System.out.println(ceil(array , 0));
        System.out.println(ceil(array , 36));
        System.out.println(floor(array , 84));
        System.out.println(floor(array , 0));
        System.out.println(floor(array , 2));
        System.out.println(floor(array , 21));
        System.out.println(floor(array , 16));
        System.out.println(floor(array , 1));
    }
}
