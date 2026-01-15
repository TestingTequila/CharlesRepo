package d5;

public class PreDecrementOperators {
    public static void main(String[] args) {

        //Post Increment
        int a = 1;
        int b = --a;
        System.out.println(a);//0
        System.out.println(b);//0

        System.out.println("===========================");
        int x = 100;
        int y = --x;
        System.out.println(x);//99
        System.out.println(y);//99

        System.out.println("===========================");
        int c = 99;
        int d = --c;
        System.out.println(c);//98
        System.out.println(d);//98

        System.out.println("===========================");
        int f = -100;
        int g = --f;
        System.out.println(f);//-101
        System.out.println(g);//-101

        System.out.println("===========================");

        int j = -2;
        int k = --j;
        System.out.println(j);//-3
        System.out.println(k);//-3


    }
}
