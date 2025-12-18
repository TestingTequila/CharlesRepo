package d2;

public class StringManipulation {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "Charles";

        int a = 100;
        int b = 200;

        System.out.println(x);//Hello
        System.out.println(y);//Charles

        System.out.println(a);//100
        System.out.println(b);//200

        System.out.println(x + y);//HelloCharles
        System.out.println(a + b);//300

        System.out.println(x + a);//Hello+100 => Hello100
        System.out.println(a + b + x + y);//300HelloCharles

        System.out.println(x + y + a + b);//HelloCharles100200
        System.out.println(a + b + x + y + a + b);//300HelloCharles100200

        double d1 = 12.34;
        double d2 = 23.11;
        System.out.println(d1 + d2);// 12.34+23.11  = 35.45

        System.out.println(x + y + d1 + d2); //HelloCharles12.3423.11


        System.out.println(x+a*b); //Hello20000 => BODMAS rule
        System.out.println(x+b/a); //Hello+2=> Hello2
        //System.out.println((x+b)/a); //(Hello200)/100 ==> Compile time Error

    }
}
