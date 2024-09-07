package BittWise;

public class SetBit {
    public static void main(String[] args) {
        int n =1000 ;
        System.out.println(Integer.toBinaryString(n));
        System.out.println("hello Bhautik this is written from the git hub codespace")
        System.out.println(setBit(n));
    }
    static int setBit(int n ){
        int c =0 ;
        while (n > 0){
            c++ ;
            n = n & (n-1);
        }
        return c ;
    }
}
