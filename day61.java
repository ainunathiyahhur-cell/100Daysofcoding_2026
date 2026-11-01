import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int n = input.nextInt();

        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Hasil perkalian 1 sampai " + n + " = " + hasil);
    }
}