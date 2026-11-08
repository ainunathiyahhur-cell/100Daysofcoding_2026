import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        System.out.println("\nGaris Vertikal:");
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        System.out.println("\nGaris Horizontal:");
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        System.out.println("\n\nPola Persegi:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}