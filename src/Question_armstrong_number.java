public class Question_armstrong_number {


    static boolean isArmstrong(int num){
        int orignal = num ;
        int sum = 0 ;
        while (num > 0){
            int rem = num%10;
            sum =sum + rem*rem*rem;
            num = num/10;
        }
        if(sum == orignal){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

    for (int i = 100 ; i <= 1000 ; i++ ){
        if (isArmstrong(i)){
            System.out.print(i + ", ");
        }
    }

    }
}
