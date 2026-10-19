import java.util.Scanner;
public class day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        int pilihan;
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();
        System.out.println("\n=== KALKULATOR ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Pilih operasi (1-4): ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan = " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan = " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian = " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil pembagian = " + hasil);
                } else {
                    System.out.println("Tidak bisa dibagi dengan nol!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        input.close();
    }
}
