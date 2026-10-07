import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah genap");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah ganjil");
        }
    }
}
