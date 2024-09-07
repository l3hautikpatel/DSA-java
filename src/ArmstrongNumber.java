public class ArmstrongNumber {
    public static void main(String[] args) {

        armstrongBtwNumbers(999,99999);
    }

    static void armstrongBtwNumbers(int s , int e){
        for(int i = s+1 ; i<e ;i++){
            armstrong(i);
        }
    }
    static void armstrong(int num){
        int digit = 0;
        int n = num;
        while(n != 0){
             n= n/10;
            digit++;
        }
        n = num;
        int result = 0;
        for(int i = 0 ; i< digit ; i++){
            int d = n % 10 ;
            result += Math.pow(d , digit);
            n= n/10;
        }
        if(result  == num) System.out.println(num);
    }
}
