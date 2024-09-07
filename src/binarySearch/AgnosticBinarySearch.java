package binarySearch;

public class AgnosticBinarySearch {
    static int Agnbinarysearch(int[] arr , int tar){
        int start = 0 ;
        int end= arr.length - 1 ;
        boolean isAce = arr[start] < arr[end];

        while (start <= end) {
            if (isAce) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == tar) return mid;
                if (arr[mid] < tar) start = mid + 1;
                else end = mid - 1;
            } else {
                int mid = start + (end - start) / 2;
                if (arr[mid] == tar) return mid;
                if (arr[mid] > tar) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array  = {1,2,10,15,18,19,20,24,25,28,29,30,38,38,39,40,45,48,49,51,56,58,61,63,64,66,69,71,75,78,79,80};
        System.out.println(Agnbinarysearch(array , 40));
    }
}
