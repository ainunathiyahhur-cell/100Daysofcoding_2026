import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Uang tabungan awal : ");
        double tabunganAwal = input.nextDouble();

        System.out.print("Uang dari ayah : ");
        double uangAyah = input.nextDouble();

        System.out.print("Uang dari ibu : ");
        double uangIbu = input.nextDouble();

        double totalTabunganSaatIni = tabunganAwal + uangAyah + uangIbu;
        System.out.println("Uang Tabungan rian saat ini : " + totalTabunganSaatIni);

        System.out.print("Rian membeli Buku seharga : ");
        double hargaBuku = input.nextDouble();

        double sisaUang = totalTabunganSaatIni - hargaBuku;
        System.out.println("Sisa Uang rian Saat ini : " + sisaUang);

    }
}
