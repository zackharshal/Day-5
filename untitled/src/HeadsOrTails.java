import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number of times to flip a coin: ");
        int num = sc.nextInt();
        float heads = 0, tails = 0;
        if(num<1){
            System.out.println("Enter a positive integer.");
        }else {
            for (int i = 1; i <= num; i++) {
                double rand = Math.random();
                if (rand < 0.5) {
                    tails++;
                    System.out.println("Tails");
                } else {
                    System.out.println("Heads");
                    heads++;
                }
            }
            if (heads != 0) {
                heads = (heads / num) * 100;
            }
            if (tails != 0) {
                tails = (tails / num) * 100;
            }
            System.out.print("The percentage of heads is: ");
            System.out.println((int)heads);
            System.out.print("The percentage of tails is: ");
            System.out.println((int)tails);
        }
    }
}
