package recursion;

public class Ass_MinMax_InArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,8,9,-10,-305,60};
        System.out.println(functionminmax(array, array.length,true));
        System.out.println(functionminmax(array, array.length,false));
    }
    static int functionminmax(int[] arr , int n,boolean max){
        if(n == 1){
                return arr[0];
        }
        if(max) return Math.max(arr[n-1] , functionminmax(arr ,n-1, max));
        return Math.min(arr[n-1] , functionminmax(arr ,n-1, max));
    }
}

