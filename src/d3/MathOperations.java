package d3;

public class MathOperations {
    public static void main(String[] args) {

        System.out.println("====================Case 1: I/I = I part======================");
        System.out.println(10 / 2); //5
        System.out.println(9 / 2);  //4

        System.out.println("=================D/N or N/D = I.D =========================");

        System.out.println(10 / 2.0);//5.0
        System.out.println(9 / 2.0); //4.5
        System.out.println(10.0 / 2);//5.0
        System.out.println(9.0 / 2); //4.5

        System.out.println("=====================Example======================");
        int a = 10;
        int b = 2;
        int c = 3;
        double divide = a / c; //10/3
        System.out.println(divide);//3.0

        System.out.println("=======================Modulo Operator============");
        System.out.println(10 % 2);//0
        System.out.println(9 % 2); //1
        System.out.println(10.0 % 2);//0.0
        System.out.println(9.0 % 2);//1.0

        System.out.println("==============Increment/Decrement Operator=========");
    }
}
