package LinearSearch;

public class EvenDigitInArr {


    public static void main(String[] args) {
        int[] arr = {10,50,84,6,45,8516,8484,45198,49,94,998,8949,8189,891,98198,1984,5};
        System.out.println(evenDigitarr(arr));

        int num = -1123456789;
        // to find the numbers of digit
        if (num < 0 )num = num *-1;
        System.out.println((int)Math.log10(num)+1);



    }






    static int evenDigitarr(int[] arr){
        int count = 0 ;
            for(int ar : arr){
                if(even(ar))count++;
            }
        return count;
    }
    static boolean even(int num){
        if (num < 0 ){
            num = num * -1;
        }
/*
        if(num%2 == 0)return true;
        else return false;
*/

        return num%2 == 0 ;



    }
}
