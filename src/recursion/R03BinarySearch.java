package recursion;

public class R03BinarySearch {
    public static void main(String[] args) {
        System.out.println("hello bhautik");
        int[] array  = {1,2,10,15,18,19,20,24,25,28,29,30,38,38,39,40,45,48,49,51,56,58,61,63,64,66,69,71,75,78,79,80};
        System.out.println(binary(array , 0, array.length-1 , -893));

    }

    static int binary(int[] arr , int s , int e , int target){
        if(s > e ) return -1;
        int m = s + (e-s)/2;
        if(arr[m] == target) return m ;
        else if(arr[m] > target) return binary(arr , s, m-1,target);
        else return binary(arr , m+1 ,e ,target);
    }
}
