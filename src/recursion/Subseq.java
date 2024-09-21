package recursion;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        subseq("" , "abc");
        System.out.println(subSeq2("" , "abc"));
        System.out.println(removeapp("herhwreappleareadapplolololo"));
        System.out.println(removeappButnotApple(
                "herhwreappleareadapplolololo"));

    }


    static String removeapp(String str){
        if(str.isEmpty()) return "";

        if(str.startsWith("app")){
            return removeapp(str.substring(3));
        }else{
            return str.charAt(0) + removeapp(str.substring(1));
        }
    }


    static String removeappButnotApple(String str){
        if(str.isEmpty()) return "";
        if(str.startsWith("app") && !str.startsWith("apple")) return removeappButnotApple(str.substring(3));
        else return str.charAt(0) + removeappButnotApple(str.substring(1));
    }


    static void subseq(String p , String up){
        if(up.equals("")){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch , up.substring(1));
        subseq(p , up.substring(1));
    }


    static ArrayList<String> subSeq2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> le = subSeq2(p + ch , up.substring(1));
        ArrayList<String> re = subSeq2(p  , up.substring(1));
        le.addAll(re);
        return le;
    }
}
