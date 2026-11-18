import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "athiyah";
        String password = "12345";

        String user;
        String pass;

        do {
            System.out.print("Masukkan username: ");
            user = input.nextLine();

            System.out.print("Masukkan password: ");
            pass = input.nextLine();

            if (!user.equals(username) || !pass.equals(password)) {
                System.out.println("Username atau password salah!");
                System.out.println();
            }

        } while (!user.equals(username) || !pass.equals(password));

        System.out.println("Login berhasil!");
        System.out.println("Selamat datang, " + username);
    }
}