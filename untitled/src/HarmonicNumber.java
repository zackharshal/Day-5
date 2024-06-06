import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num <1){
            System.out.println("Enter a positive integer.");
            return;
        }
        float harmonic = 0;
        for(float i = 1; i <= num; i++){
            harmonic += (float) 1 /i;
        }
        System.out.println("The value of the " + num + " harmonic number is " + harmonic);
    }
}
