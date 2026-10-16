import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== MENU PILIHAN ===");
        System.out.println("1. Biodata");
        System.out.println("2. Luas Persegi");
        System.out.println("3. Cek Ganjil Genap");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Menu Biodata");
                break;
            case 2:
                System.out.println("Menu Luas Persegi");
                break;
            case 3:
                System.out.println("Menu Cek Ganjil Genap");
                break;
            case 4:
                System.out.println("Program selesai");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        input.close();
    }
}
