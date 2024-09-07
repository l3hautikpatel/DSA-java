public class TypeCasting {
    public static void main(String[] args) {


        int num = (int)(54.2345f);


        int a =1 ;
        float b =a ;
        System.out.println(b);

        byte c =50 ;
        System.out.println("value of (byte)c = " + c);
        byte d =40 ;
        System.out.println("value of (byte)d = " + d);
        byte e =10;
        System.out.println("value of (byte)e = " + e);
        int f = c*d/e ;
        System.out.println("value of (int)f "+f);
        //byte g = c*d/e ;  this  maths exide the rage of byte
        //System.out.println("value of (byte)g "+g);

        int asccie = 'a';
        System.out.println(asccie);

        System.out.println("java બધી ભાષા સપોર્ટ કરે છે ગુજરાતી હિન્દી અને ઘણી બીજી પણ ");
        System.out.println((double)a/3);

    }
}
