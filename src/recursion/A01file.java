package recursion;

public class A01file {
    public static void main(String[] args) {
        System.out.println("hello bhautik ");

        printnumber(1);
    }

    static void printnumber(int n ){

        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printnumber(n+1);


    }
}
