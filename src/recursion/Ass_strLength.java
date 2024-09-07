package recursion;

public class Ass_strLength {
    public static void main(String[] args) {
        System.out.println(strlrngth("Bhautik"));
        System.out.println("bhsutik".substring(1));
    }

    static int strlrngth(String str){
        if(str.equals("")) return 0;
        return strlrngth(str.substring(1)) + 1 ;
    }
}
