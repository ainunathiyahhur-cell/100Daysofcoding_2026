import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int jumlah = 0;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        while (angka >= 0) {
            jumlah = jumlah + angka;

            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
        }

        System.out.println("Jumlah = " + jumlah);
    }
}