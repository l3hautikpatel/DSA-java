package pattern;

public class Patternss {
    public static void main(String[] args) {

        patterns31(5);

    }

    static void patterns31(int n) {
        n = n*2;
        for(int row = 1; row < n ; row++){
            for(int col = 1 ; col <  n ; col++){
                int up = row;
                int down = n - row;
                int right = col ;
                int left =  n - col;
                int num =  Math.min(Math.min(up,down) , Math.min(right,left));
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    static void patterns17(int n){

        for(int i = 1 ; i <= 2*n-1 ; i++ ){
            int col = i > n ? 2*n-i :i;
            for(int j = 0 ; j <= n-col; j++){
                System.out.print("  ");
            }
            for(int j = col ; j >= 1 ; j--) System.out.print(j +" ");
            for(int j = 2 ; j <= col ; j++) System.out.print(j +" ");
            System.out.println();
        }
    }






    static void patterns30(int n){

        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 0 ; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = i ; j >= 1 ; j--) System.out.print(j +" ");
            for(int j = 2 ; j <= i ; j++) System.out.print(j +" ");
            System.out.println();
        }
    }
    static void patterns28(int n){
        for(int i = 0 ; i < 2*n ; i++){
            int col = i > n ? 2*n-i : i;
            int space = n - col ;
            for (int k = 0 ; k < space ; k++) System.out.print(" ");
            for(int j = 0 ; j < col ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patterns5(int n){
        for(int i = 0 ; i < 2*n ; i++){
            int col = i > n ? 2*n-i : i;
            for(int j = 0 ; j < col ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
