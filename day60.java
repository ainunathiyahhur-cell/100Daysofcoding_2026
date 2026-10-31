import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int n = input.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }

        System.out.println("Jumlah angka 1 sampai " + n + " = " + jumlah);
    }
}