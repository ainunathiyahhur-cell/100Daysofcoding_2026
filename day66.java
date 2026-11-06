import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah garis: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}