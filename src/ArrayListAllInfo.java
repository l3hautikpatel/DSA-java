import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListAllInfo {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);


        /*ArrayList<Datatype> name of the array list = new ArrayList<datatype>(defult length if we want);*/
        ArrayList<Integer> list1 = new ArrayList<>(); // insilize the array list
        list1.add(10); // add the value in the next posssible index
        list1.add(10089);
        list1.add(10000);
        list1.add(1000);
        list1.add(100);

        System.out.println(list1);
        list1.remove(1); // tack the index and remove from the value from that index in the list

        System.out.println(list1.contains(10)); //tack the valur and, check whether the passed value is in the array list or not

        System.out.println(list1);
        list1.set(1,12312); // tack the index and the value and set that value at that index by removing the value at that place
        System.out.println(list1);

        System.out.println(list1.get(1));// tack the index and return the value from that index
/*        System.out.println(list1.get(1221));   this is throw error in the console because this si the out of bound*/

        System.out.println(list1.size()); // give the length of the arraylist


        // implimenting the 2D array list which is types of the String

        ArrayList<ArrayList<String>> list2 = new ArrayList<>();

        // for every list in side the list2 we need to assing the array list like this
        list2.add(new ArrayList<>());
        list2.get(0).add("Bhautik");

        System.out.println(list2);

        // now we have like 10 of the list inside the list look the for loop
        for (int i = 0; i < 10; i++) {
            list2.add(new ArrayList<>());
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3 ; j++){
            list2.get(i).add(sc.next());
            }
        }

        System.out.println(list2);


        System.out.println(list2.subList(0,2));



        // this is all about the arrayList that i need to understand and all set by by ;

    }
}
