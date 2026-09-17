public class day16 {
    public static void main(String[] args) {

        int jumlahSiswa = 47;
        int kapasitasBus = 10;

        int busPenuh = jumlahSiswa / kapasitasBus;
        int siswaSisa = jumlahSiswa % kapasitasBus;

        System.out.println("Jumlah bus penuh: " + busPenuh);
        System.out.println("Siswa yang tersisa: " + siswaSisa);
    }
}
