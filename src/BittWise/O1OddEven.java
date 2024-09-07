package BittWise;

public class O1OddEven {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println( "is Odd : "+check(0));
        System.out.println(~0);
    }

    static boolean check(int i){
        return (i & 1) == 1 ;
    }
}
