package BittWise;

import java.util.ArrayList;

public class ArrayRepeate {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10};
        int time =3 ;
        System.out.println(check(nums , time));  // expected output is 10;
    }

    static int check(int[] n ,int t){
        int ans = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n.length ; i++){
            int sum = 0 ;
            while(i > 0){
                int last = i&1 ;
                i = i>>1 ;

            }
        }

        return ans ;
    }
}
