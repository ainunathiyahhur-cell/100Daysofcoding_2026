import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan temperatur ruangan (°C): ");
        double suhu = input.nextDouble();
        if (suhu < 20) {
            System.out.println("Temperatur ruangan: Dingin");
        } else if (suhu <= 30) {
            System.out.println("Temperatur ruangan: Normal");
        } else {
            System.out.println("Temperatur ruangan: Panas");
        }
    }
}
