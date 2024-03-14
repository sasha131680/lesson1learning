import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input a number: ");
        int a = scanner.nextInt();
        System.out.print("please input another number: ");
        int b = scanner.nextInt();

        System.out.print("please input an action: ");
        String action = scanner.next();
        System.out.print("answer is ");


        if (action.equals("^")) {
            System.out.println(Math.pow(a, b));
        } else if (action.equals("%")) {
            System.out.println(a % b);
        } else if (action.equals("+")) {
            System.out.println(a + b);
        } else if (action.equals("-")) {
            System.out.println(a - b);
        } else if (action.equals("*")) {
            System.out.println(a * b);
        } else if (action.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("wrong input");
        }


    }
}
