import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Masukkan angka yang dicari: ");
        int cari = in.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Angka tidak ditemukan");
        }
    }
}