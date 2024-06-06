import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Enter a positive number.");
            return;
        }
        if(num > 31){
            System.out.println("Enter a value less than 31.");
            return;
        }
        for(int i = 0; i <= num; i++){
            int ans = (int) Math.pow(2, i);
            System.out.println("2 ^ " + i + " = " + ans);
        }
    }
}
