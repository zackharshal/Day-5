import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the y coordinate:");
        int y = sc.nextInt();
        double elucDist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("The Euclidean distance from point ("+x+","+y+") to (0,0) is "+ elucDist);
    }
}
