import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        
        System.out.print("Masukkan bilangan pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double b = input.nextDouble();

        System.out.print("Pilih operator (+, -, *, /): ");
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println("Hasil = " + (a + b));
        } else if (operator.equals("-")) {
            System.out.println("Hasil = " + (a - b));
        } else if (operator.equals("*")) {
            System.out.println("Hasil = " + (a * b));
        } else if (operator.equals("/")) {
            if (b != 0) {
                System.out.println("Hasil = " + (a / b));
            } else {
                System.out.println("Tidak bisa membagi dengan nol!");
            }
        } else {
            System.out.println("Operator tidak tersedia!");
        }
    }
}
