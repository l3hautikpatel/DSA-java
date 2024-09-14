package math;

public class Sqroot {
    public static void main(String[] args) {
        int n = 34;
        int p = 3;
        System.out.println(sqrootof( n , p ));
    }

    private static double sqrootof(int n, int p) {
        int s  = 0 ;
        int e = n;
        double root  = 0.0 ;
        while(s <= e ){
            int mid = s + (e - s) /2 ;
            if(mid * mid == n) return  mid;
            else if (mid * mid <  n ) {s = mid +1 ; root  = mid;}
            else e = mid -1 ;
        }
        double icr = 0.1;
        for(int i = 0 ; i < p ; i++){
            while(root * root  <= n){
                root += icr;
            }
            root-=icr;
            icr /= 10;
        }
        return root ;
    }
}
