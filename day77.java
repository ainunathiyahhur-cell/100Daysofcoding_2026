public class day77 {
    public static void main(String[] args) {
        String nama = "  Athiyah Hur Ainun  ";
        String jurusan = "Informatika";
        // length()
        System.out.println("Panjang nama: " + nama.length());
        // trim()
        String namaBersih = nama.trim();
        System.out.println("Nama setelah trim: " + namaBersih);
        // charAt()
        System.out.println("Huruf pertama: " + namaBersih.charAt(0));
        // substring()
        String namaDepan = namaBersih.substring(0, 7);
        System.out.println("Nama depan: " + namaDepan);
        // replace()
        String namaGanti = namaBersih.replace("Athiyah", "Tya");
        System.out.println("Setelah replace: " + namaGanti);
        // concat()
        String identitas = namaBersih.concat(" - ").concat(jurusan);
        System.out.println("Identitas: " + identitas);
    }
}