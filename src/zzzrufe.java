public class zzzrufe {

    public static void main(String[] args) {
/*
        System.out.println("hello bhautik  fro this when codwe tyhis ie vsdnjfsd  j \n thuas us niot rer ");*/

        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);

    }
    static int maxProfit(int[] prices) {
        int max = 0;
        for(int i = prices.length-1 ; i > 0 ; i--){
            System.out.println(prices[i]);
            for(int j = 0 ; j < i ; j++){
                int diff = prices[i] - prices[j] ;
                System.out.println( diff + " " +max);
                if(diff > max) max = diff;
            }
        }
        return max;
    }
}