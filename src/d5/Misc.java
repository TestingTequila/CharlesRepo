package d5;

public class Misc
{
    public static void main(String[] args) {

        int x =65;
        int y = ++x;
        int z = y--;
        int t = x++;
        int s = ++y;

        System.out.println(x);//67
        System.out.println(y);//66
        System.out.println(z);//66
        System.out.println(t);//66
        System.out.println(s);//66
    }
}
