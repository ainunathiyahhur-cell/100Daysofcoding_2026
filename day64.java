import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        long hasil = 1;

        System.out.print("Masukkan bilangan: ");
        n = input.nextInt();

        if (n < 0) {
            System.out.println("Bilangan tidak valid");
        } else {
            for (int i = 1; i <= n; i++) {
                hasil = hasil * i;
            }

            System.out.println("Faktorial dari " + n + " adalah " + hasil);
        }
    }
}