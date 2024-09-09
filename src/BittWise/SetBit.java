package BittWise;

import java.util.ArrayList;
import java.util.List;

public class SetBit {
    public static void main(String[] args) {
        int n =1000 ;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBit(n));
    }
    static int setBit(int n ){
        int c =0 ;
        while (n > 0){
            c++ ;
            n = n & (n-1);
        }
        return c ;
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        int substring =  1 << n ;

        for(int i  =0 ; i < substring ; i++){
            List<Integer> ss = new ArrayList<>();
            for(int j = 0 ; j< n ; j++ ){
                if( (i & (1 << j)) != 0){
                    ss.add(nums[j]);
                }
            }
            result.add(ss);
        }

        return result ;
    }





}
