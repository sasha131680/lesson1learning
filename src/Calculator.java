import java.util.Scanner;

public class Calculator {
    static double x;
    static double y;

    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.println("enter a number");

        x = 9;
        y = 3;
//        double z = x * y;
        double d = x + y;
//        double b = x / y;
//        double f = x - y;
        double z = sum(6, minus(4, 2));
//        z = z + 2;

        System.out.println(z);

    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double minus(double a, double b) {
        return a - b;
    }


}
