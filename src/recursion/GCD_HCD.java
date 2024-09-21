package recursion;

public class GCD_HCD {
    public static void main(String[] args) {
        int a = 60 ;
        int b = 72;
        System.out.println(gcd2(a,b));
        System.out.println(hcf(a,b));
    }

    static int gcd2(int a , int b){
        while(a > 0 && b > 0){
            if(a > b) a = a%b;
            else b = b%a;
        }if(a == 0 ) return b ;
        else return a ;
    }
    static int gcd(int a ,int b){
        if(a == 0){
            return b;
        }
        return gcd(a%b ,b );
    }

    static int hcf(int a , int b){
        return (a*b)/gcd2(a,b);
    }

}
