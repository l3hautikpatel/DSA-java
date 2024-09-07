import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("give me your roll number");
        int  rollNo = input.nextInt();
        System.out.println("Your roll number is "+rollNo);

        System.out.println("give me your  name ");
        String name = input.next();
        System.out.println(" ");


    }
}
