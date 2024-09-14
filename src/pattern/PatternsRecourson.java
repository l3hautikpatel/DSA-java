package pattern;

public class PatternsRecourson {
    public static void main(String[] args) {
        patter01(2);
        System.out.println();
        patter02(2);
    }
    static void patter01(int n ){
        System.out.println();
        if(n == 1){
            System.out.print( "*");
            return ;
        }
        for(int i = 0 ; i < n ; i++ ){
            System.out.print( "* ");
        }
        patter01(n-1);

    }
    static void patter02(int n ){
        if(n == 1){
            System.out.print( "*");
            return ;
        }
        patter02(n-1);
        System.out.println();
        for(int i = 0 ; i < n ; i++ ){
            System.out.print( "* ");
        }


    }
}
