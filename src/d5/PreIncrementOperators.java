package d5;

public class PreIncrementOperators {
    public static void main(String[] args) {

        //Post Increment
        int a = 1;
        int b = ++a;
        System.out.println(a);//2
        System.out.println(b);//2

        System.out.println("===========================");
        int x = 100;
        int y = ++x;
        System.out.println(x);//101
        System.out.println(y);//101

        System.out.println("===========================");
        int c = 99;
        int d = ++c;
        System.out.println(c);//100
        System.out.println(d);//100

        System.out.println("===========================");
        int f = -100;
        int g = ++f;
        System.out.println(f);//-99
        System.out.println(g);//-99

        System.out.println("===========================");

        int j = -2;
        int k = ++j;
        System.out.println(j);//-1
        System.out.println(k);//-1


    }
}
