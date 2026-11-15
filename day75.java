import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata1, kata2, teks;

        System.out.print("Masukkan kata pertama: ");
        kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua: ");
        kata2 = input.nextLine();

        System.out.print("Masukkan teks: ");
        teks = input.nextLine();

        System.out.println("\n=== equals() ===");
        System.out.println("Apakah kata sama? " + kata1.equals(kata2));

        System.out.println("\n=== equalsIgnoreCase() ===");
        System.out.println("Apakah kata sama tanpa memperhatikan huruf besar/kecil? "
                + kata1.equalsIgnoreCase(kata2));

        System.out.println("\n=== contains() ===");
        System.out.print("Masukkan kata yang ingin dicari: ");
        String cari = input.nextLine();

        System.out.println("Apakah teks mengandung kata tersebut? "
                + teks.contains(cari));

        System.out.println("\n=== isEmpty() ===");
        System.out.println("Apakah kata pertama kosong? " + kata1.isEmpty());
        System.out.println("Apakah kata kedua kosong? " + kata2.isEmpty());
    }
}