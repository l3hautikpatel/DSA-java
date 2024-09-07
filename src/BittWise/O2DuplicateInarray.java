package BittWise;

public class O2DuplicateInarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,0,9,0,9,8,7,6,5,4,3,2,1} ;
        System.out.println("duplicate in Array : " + check(arr));
    }
    static int check(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum  = sum ^ arr[i];
        }
        return sum ;
    }
}
