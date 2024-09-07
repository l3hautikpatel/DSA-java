package LinearSearch;

public class LinearSearch01_question {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {1,2,4,69,2,42,33,65,645,75,67,346,23,5,123,67,6,75,68,436,34,52,35,12356,231,356,78,56,8};
        System.out.println(searchLinear01(arr,34));
        System.out.println(searchLinear02("bhautik patel", 'r'));

    }

    static int searchLinear02(String sr , char c){
        for (int i = 0; i < sr.length(); i++) {
            if(c == sr.charAt(i))return i;
        }

        return -1;
    }
    static int searchLinear01(int[] arr , int num){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) return i;
        }
        return -1;
    }
}
