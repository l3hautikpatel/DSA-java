package recursion;

public class R02fibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonnaciPrint(3));
    }

    static int fibonnaciPrint(int n){
        if(n < 2){
            return  n;
        }
        return fibonnaciPrint(n - 1) + fibonnaciPrint(n - 2);
    }
}
