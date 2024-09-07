package recursion;

import java.util.Arrays;

public class Assingment10_Sum_Triangle_From_array {
    public static void main(String[] args) {
        System.out.println("hrllo");

        int[] arr ={1,2,3,4,5};
        printTriangle(arr);

    }
    static void printTriangle(int[] n){
        if(n.length <=0 ){
            return;
        }
        int[] arr = new int[n.length-1];
        for(int i =0 ; i < n.length-1 ; i++){
            arr[i] = n[i] + n[i+1];
        }
        printTriangle(arr);
        System.out.println(Arrays.toString(n));
    }
}
