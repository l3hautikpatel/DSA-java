package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2 ,2 ,2 ,2 ,2 ,2 };

        List<List<Integer>> ans = subsetArray(arr);

        for(List<Integer> list: ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> subsetArray(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        int s = 0;
        int e = 0;
        outer.add(new ArrayList<>());
        for(int i = 0 ; i < arr.length ; i++){
            s = 0 ;
            if( i > 0 && arr[i] == arr[i-1]){
                s = e + 1 ;
            }
            int n = outer.size();
            e = n-1 ;
            for(int j = s ; j < n ; j++){
                List<Integer> linner = new ArrayList<>(outer.get(j));
                linner.add(arr[i]);
                outer.add(linner);
            }
        }



        return outer;
    }
}
