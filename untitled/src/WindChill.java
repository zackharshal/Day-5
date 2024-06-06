import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        double t = scanner.nextDouble();
        if(t < 50){
            System.out.println("Enter the wind speed in miles/hour: ");
            double v = scanner.nextDouble();
            if(v > 3 && v < 120){
                double w = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));
                System.out.printf("The wind chill value for the temperature %.2fºF and wind speed %.2f miles/hour is %.2f",t,v, w);

            }else{
                System.out.println("The wind speed should be greater than 3 and less than 120 miles/hour");
            }
        }else{
            System.out.println("The formula is not valid for temperature greater than 50ºF");
        }
    }
}
