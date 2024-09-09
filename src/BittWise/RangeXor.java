package BittWise;

public class RangeXor {
    public static void main(String[] args) {
        System.out.println(xor(3));


        // rage is 3 to 9 so do this
        System.out.println(xor(9) ^ xor(3-1));
    }

    static int xor(int x){

        if(x%4 == 0){
            return x;
        }
        if(x%4 == 1){
            return 1;
        }
        if(x%4 == 2){
            return x+1;
        }

        return 0;
    }
}
