package assignments;

public class Ass02 {
    static int fibonacci(int num){
        if(num == 0 || num == 1) return 1 ;
        int ans = 1 ;
        for(int i = 1 ; i < num ; i++){
            ans = ans + i ;
        }
        return ans;
    }

    static void printFib(int count){
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }


    static boolean pelandrom(String str){
        for (int i = 0 ; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
        printFib(10);
        System.out.println();
        System.out.println(pelandrom("helloolleh"));

    }
}
