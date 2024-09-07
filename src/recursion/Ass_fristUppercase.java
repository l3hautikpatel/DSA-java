package recursion;

public class Ass_fristUppercase {
    public static void main(String[] args) {
        System.out.println(Character.isUpperCase('S'));
        String str = "hello Bhautik paTel";
        System.out.println(fristuppercasebyiterative(str));
        System.out.println(fristuppercasebyrecursive(str, str.length()-1 ,0));
    }

    static char fristuppercasebyrecursive(String str ,int e  , int n){
        if(e <= n ) return '1';
        if(Character.isUpperCase(str.charAt(n))) return str.charAt(n);
        else return fristuppercasebyrecursive(str , e,n + 1);
    }

    static char fristuppercasebyiterative(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) return str.charAt(i);
        }
        return '1';
    }
}
