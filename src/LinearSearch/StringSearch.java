package LinearSearch;

public class StringSearch {

    static boolean strserch(int i , int j , String str , char c){
        for (int k = i ; k < Math.min(str.length() , j ) ; k++){
            if(str.charAt(k) == c)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(strserch(1,10 ,"bhautik" , 'l'));
    }
}
