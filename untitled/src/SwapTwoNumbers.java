import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("The numbers before swap are " + a + " and " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The numbers after swap are " + a + " and " + b);

    }
}
