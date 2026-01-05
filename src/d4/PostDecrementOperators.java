package d4;

public class PostDecrementOperators {
    public static void main(String[] args) {

        //Post Decrement
        int a = 1;
        int b = a--;
        System.out.println(a);//0
        System.out.println(b);//1

        System.out.println("===========================");
        int x = 100;
        int y = x--;
        System.out.println(x);//
        System.out.println(y);//

        System.out.println("===========================");
        int c = 99;
        int d = c--;
        System.out.println(c);//
        System.out.println(d);//

        System.out.println("===========================");
        int f = -100;
        int g = f--;
        System.out.println(f);//
        System.out.println(g);//

        System.out.println("===========================");

        int j = -2;
        int k = j--;
        System.out.println(j);//-3
        System.out.println(k);//-2


        int m = -1000;
        int n = m--;

        System.out.println(m); //-1001
        System.out.println(n); //-1000


        int h = 1;
        int i = h++;
        int p= h--;

        System.out.println(h); // 1
        System.out.println(i); // 1
        System.out.println(p); // 2


    }
}
