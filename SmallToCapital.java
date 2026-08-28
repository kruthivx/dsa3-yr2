import java.util.Scanner;

public class SmallToCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a lowercase letter: ");
        char ch = sc.next().charAt(0);

        // Convert to uppercase
        char upper = Character.toUpperCase(ch);

        // Output
        System.out.println("Uppercase letter: " + upper);

        sc.close();
    }
}