package MapAndHasMap;

import java.util.HashMap;
import java.util.Stack;

public class HigestAndLowestFreq {

    public static void main(String[] args) {
        int[] arr ={1,2,4,6,234,34,2342,342,34234,2342345,4,534,324,123,524,545,3223,34,12,41222,2,2,2,2,2,2,2,5,432,234,234,4554};
        printHighLow(arr);

    }

    static void printHighLow( int[] arr){
        HashMap<Integer , Integer> count = new HashMap<>();

        int highfrq = Integer.MIN_VALUE;
        int lowfrq = Integer.MAX_VALUE;
        int high = 0 ;
        int low = 0 ;

        for(int num : arr){
            count.put(num , count.getOrDefault( num, 0)+1 );
        }


        for (int num : arr){
            int c = count.get(num);
            if(c > highfrq) {
                highfrq = c ;
                high = num;}
            if(c < lowfrq) {
                lowfrq = c;
                low = num;
            }
        }


        System.out.println("High fre value is :" +high);
        System.out.println("high value is : "+low);

    }


}

