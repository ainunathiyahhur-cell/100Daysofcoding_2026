import java.util.Scanner;

public class day56 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai N: ");
    int N = input.nextInt();
    System.out.println("Angka 1 sampai N:");
    for (int i = 1; i <= N; i++) {
        System.out.print(i + " ");
    }
    System.out.println("\nAngka N sampai 1:");
    for (int i = N; i >= 1; i--) {
        System.out.print(i + " ");
    }
}

}