package MapAndHasMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {12,32,43,432,5,3,46,45,47,64,34,231312,423,4342,34,54,5,3,12,312,31,3,14,5233,532,4,234,134,234,32,423,4,324,23,434,532,4,234,325,34,523,412,34,134,45,345,34,523,4,14,1234,23,4342,5,345,345,345,34,23,45342,5,45,345,};


        frequencyCount(arr,arr.length, 1000);
    }


    static void frequencyCount(int[] arr , int n , int p){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            if(arr[i] >= 1 && arr[i] <= p){
                map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
            }
        }

        for (int i = 0 ; i < n ; i++){
            arr[i] = map.getOrDefault(i+1 , 0);
        }
            System.out.println(map);
    }

}
