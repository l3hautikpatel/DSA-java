public class StrBuilder {
    public static void main(String[] args) {
        System.out.println("hello bhautik");


        StringBuilder str = new StringBuilder();
        str.append("java");
        System.out.println(str);
        str.insert(0, "Hello");
        System.out.println(str);
        str.replace(0,5 ,"Hello ");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(1,5);
        System.out.println(str);


        String name = "abcddbca";
        StringBuilder str2 = new StringBuilder(name);
        System.out.println(str2.reverse().equals(str2));




    }
}
