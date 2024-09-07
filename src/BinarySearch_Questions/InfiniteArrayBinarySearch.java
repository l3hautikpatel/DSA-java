package BinarySearch_Questions;

public class InfiniteArrayBinarySearch {

    public static int search(int[] arr , int t ){
        int s = 0 ;
        int e = 1 ;
        while(arr[e] < t){
            int ns = e + 1 ;
            e = e + (e-s +1)*2 ;
            s = ns;
        }
        return binarySearch(arr , t, s ,e);
    }

    static int binarySearch(int[] arr , int t , int s , int e){
        while(s <= e){
            int mid = s + (e-s)/2 ;
            if(arr[mid] > t ) e = mid -1 ;
            else if (arr[mid] < t) s = mid + 1 ;
            else return mid;
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17} ;
        System.out.println( search(arr ,13));
    }
}
