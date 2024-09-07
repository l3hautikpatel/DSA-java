import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name ;
        int id = sc.nextInt();
        switch (id){
            case 1 :
                System.out.println("this is case ONE");
                break;
            case 2 :
                System.out.println("this is case two");
                break;
            case 3 :
                System.out.println("I think you are talking about this mane ");
                break;
            case 4 :
                System.out.println("enter name ");
                name = sc.next();
                switch (name) {
                    case "bhautik":
                        System.out.println("yes bhautik is in IT department");
                        break;
                    case "avinash":
                        System.out.println("avinash in BIGBOSS");
                        break;
                    case "mahesh":
                        System.out.println("no mahesh is NOT in BIGBOSS");
                        break;
                    default:
                        System.err.println("SORRY we can not find this person in our dataset");
                }
                break;
            default:
                System.err.println("Please register this id with valid name and details");

        }

    }
}




