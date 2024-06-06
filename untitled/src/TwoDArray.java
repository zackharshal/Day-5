import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Enter the position at " + (i+1) + ", " + (j+1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements in the 2D array are: ");
        System.out.print("[");
        for(int i = 0; i < rows; i++){
            System.out.print("[");
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            if (i == rows-1){
                System.out.print("]");
            }else{
                System.out.println("],");
            }
        }
        System.out.print("]");
    }
}
