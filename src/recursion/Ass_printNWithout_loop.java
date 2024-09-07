package recursion;

public class Ass_printNWithout_loop {
    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
        if(n <= 0) {
            System.out.print(0);
            return ;
        }
        System.out.print(n + " ");
        print(n-1);
    }
}
