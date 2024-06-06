import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("The prime factors of " + num + " are ");
        for (int i = 2; i <= num; i++){
            int c = 0;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    c++;
                }
            }
            if(c ==0){
                if( num % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
