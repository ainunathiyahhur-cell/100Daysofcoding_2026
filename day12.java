import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Umur   : " + umur);
    }
}
