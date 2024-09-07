public class Question_prime_number {

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c =2;
        while(c * c <= num ){
            if(num % c == 0){
                return true;
            }
            c++;
        }
        return c*c>num;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(89));
    }
}
