import java.util.Scanner;

public class VowelsOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String a = sc.next();
        if(a == "a" || a == "e" || a == "i" || a == "o" || a == "u" || a == "A" || a == "E" || a == "I" || a == "O" || a == "U"){
            System.out.println(a + " is a vowel");
        }else{
            System.out.println(a + " ia a consonant");
        }
    }
}
