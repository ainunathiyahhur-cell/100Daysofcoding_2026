import java.util.Scanner;
public class day54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Tidak terdefinisi");
        } else {
            long hasil = 1;
            for (int i = 1; i <= n; i++) {
                hasil *= i;
            }
            System.out.println(hasil);
        }
    }
}
