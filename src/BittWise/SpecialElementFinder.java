package BittWise;

public class SpecialElementFinder {
    public static void main(String[] args) {
        int[] array = {2, 2, 2, 3, 3, 3, 4, 4, 4, 4,4,4 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }; // Example array
        int k = 3; // Elements appear exactly k times except one

        int result = findSpecialElement(array, k);
        System.out.println("The special element is: " + result);
    }

    private static int findSpecialElement(int[] array, int k) {
        int result = 0 ;
        int[] bitCOunt = new int[32];

        for(int n : array){
            for(int i = 0 ; i < 32 ;i++){
                if((n & (1<<i)) != 0)bitCOunt[i]++;
            }
        }

        for(int i = 0 ; i < 32 ; i++){
            if(bitCOunt[i] % k != 0){
                result |= 1<<i ;
            }
        }

        return result ;
    }
}
