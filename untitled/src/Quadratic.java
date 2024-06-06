import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first variable: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second variable: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third variable: ");
        int c = scanner.nextInt();
        double delta = (b*b) - (4 * a * c);
        double firstRoot = (-b + Math.sqrt(delta))/(2 *a);
        double secondRoot = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("The two roots of "+a+"x^2 + "+b+"x + "+c+" are "+ firstRoot+", " +secondRoot);
    }
}
