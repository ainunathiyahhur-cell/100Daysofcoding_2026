import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng - Rp15000");
        System.out.println("2. Mie Ayam    - Rp12000");
        System.out.println("3. Bakso       - Rp10000");
        System.out.print("Pilih menu (1-3): ");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
            System.out.println("Harga: Rp15000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam");
            System.out.println("Harga: Rp12000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Bakso");
            System.out.println("Harga: Rp10000");
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}
