import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = input.nextDouble();
        double pajak;
        if (gajiPokok >= 5000000) {
            pajak = gajiPokok * 0.10;
        } else {
            pajak = gajiPokok * 0.05;
        }
        double gajiBersih = gajiPokok - pajak;
        System.out.println("\n=== HASIL PERHITUNGAN GAJI ===");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
        input.close();
    }
}
