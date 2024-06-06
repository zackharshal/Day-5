import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i<len;i++){
            System.out.print("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        int c =0;
        for(int i = 0;i<arr.length -2;i++){
            for(int j = i+1; j<arr.length-1;j++){
                for (int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("Sum of three numbers that add to 0 are "+ arr[i] + ", " + arr[j] + ", "+ arr[k]);
                        c++;
                    }
                }
            }
        }
        if (c==0){
            System.out.println("No three number add to form 0");
        }

    }
}
