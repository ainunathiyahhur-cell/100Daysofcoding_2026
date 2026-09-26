import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jariJari, luas;
        final double phi = 3.14;

        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = input.nextDouble();

        luas = phi * jariJari * jariJari;

        System.out.println("Luas lingkaran = " + luas);
    }
}
