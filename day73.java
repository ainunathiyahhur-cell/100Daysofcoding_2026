import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih menu Tambah");
                    break;

                case 2:
                    System.out.println("Anda memilih menu Kurang");
                    break;

                case 3:
                    System.out.println("Anda memilih menu Kali");
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 4);
    }
}