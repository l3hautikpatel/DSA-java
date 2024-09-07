package BittWise;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(sumOfRaw(4));
    }
    static int sumOfRaw(int i){
        return 1 << (i - 1) ;
    }
}
