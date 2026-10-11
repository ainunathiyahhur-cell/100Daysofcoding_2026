import java.util.Scanner;

public class pendaftaran {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Masukkan Umur: ");
        int umur = i.nextInt();

        System.out.println("Masukkan status kepemilikan: ");
        int kartu = i.nextInt();

        if (umur >= 17 && kartu == 1){
            System.out.println("Boleh mendaftar");

        if (umur >= 21 ){
            System.out.println("Usia 21 tahun ke atas");
        }

        }else {
            System.out.println("belum memenuhi syarat");
        }

    }
}
