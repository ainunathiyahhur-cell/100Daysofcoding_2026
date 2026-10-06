public class day35 {
    public static void main(String[] args) {
        int nilai = 80;
        boolean hadir = true;

        if (nilai >= 60) {
            System.out.println("Nilai memenuhi syarat");

            if (hadir) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus karena tidak hadir");
            }

        } else {
            System.out.println("Tidak Lulus karena nilai kurang");
        }
    }
}
