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
        int p = h--;

        System.out.println(h); // 1
        System.out.println(i); // 1
        System.out.println(p); // 2

        int q = 12;
        int r = q--;
        int s = r++;
        int t = s--;

        System.out.println(q);//11
        System.out.println(r);//13
        System.out.println(s);//11
        System.out.println(t);//12

        System.out.println("===================================================");

        int u = 30;
        int v = u--;
        int w = v--;
        int z = u++;

        System.out.println(u);//30
        System.out.println(v);//29
        System.out.println(w);//30
        System.out.println(z);//29

        System.out.println("===========================================");

        int a1 = 44;
        int a2 = a1++;
        int a3 = a1--;
        int a4 = a3--;

        System.out.println(a1);//44
        System.out.println(a2);//44
        System.out.println(a3);//44
        System.out.println(a4);//45

        System.out.println("===========================================");

        int d1 = 100;
        int d2 = d1++;
        int d3 = d1--;
        int d4 = d2--;

        System.out.println(d1);//100
        System.out.println(d2);//99
        System.out.println(d3);//101
        System.out.println(d4);//100

        System.out.println("===========================================");

        int t1 = 23;
        int t2 = t1--;
        int t3 = t2--;
        int t4 = t2++;

        System.out.println(t1);//22
        System.out.println(t2);//23

        System.out.println("===========================================");

        int k1 = 50;
        int k2 = k1++;
        int k3 = k2--;
        int k4 = k1--;
        int k5 = k4++;

        System.out.println(k1);//50
        System.out.println(k2);//49
        System.out.println(k3);//50
        System.out.println(k4);//52
        System.out.println(k5);//51


    }
}
