import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi, luas;

        System.out.print("Masukkan sisi persegi: ");
        sisi = input.nextInt();

        luas = sisi * sisi;

        System.out.println("Luas persegi = " + luas);
    }
}
