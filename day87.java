import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] data = {10, 20, 30, 40, 50};

        System.out.println("Data awal:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.print("\n\nMasukkan indeks yang ingin diubah: ");
        int indeks = in.nextInt();

        System.out.print("Masukkan nilai baru: ");
        int nilaiBaru = in.nextInt();

        data[indeks] = nilaiBaru;

        System.out.println("\nData setelah diubah:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}