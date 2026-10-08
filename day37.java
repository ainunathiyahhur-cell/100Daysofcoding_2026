import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan " + bilangan + " adalah positif");
        } else if (bilangan < 0) {
            System.out.println("Bilangan " + bilangan + " adalah negatif");
        } else {
            System.out.println("Bilangan adalah nol");
        }
    }
}
