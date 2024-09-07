package BittWise;

public class NthmagicNumber {

    public static void main(String[] args) {
        System.out.println(magicnum(5 ,5));
    }

    static int magicnum(int n ,int base){
        int ans  = 0 ;
        int i = 0 ;
        while(n > 0 ){

            if((n&1) == 1) ans += Math.pow(base , i + 1);
            n>>=1;
            i++;
        }

        return ans;
    }
}
