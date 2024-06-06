import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is an " + result + " number.");
//        if(num % 2 == 0){
//            System.out.println(num +" is an even number.");
//        }else{
//            System.out.println(num + " is an odd number.");
//        }
    }
}
