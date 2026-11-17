public class day77 {
    public static void main(String[] args) {
        String nama = "  Athiyah Hur Ainun  ";
        String jurusan = "Informatika";
        String nim = "D0225510";
        // 1. length()
        System.out.println("Panjang nama: " + nama.length());
        // 2. trim()
        String namaBersih = nama.trim();
        System.out.println("Nama setelah trim: " + namaBersih);
        // 3. toUpperCase()
        System.out.println("Huruf besar: " + namaBersih.toUpperCase());
        // 4. toLowerCase()
        System.out.println("Huruf kecil: " + namaBersih.toLowerCase());
        // 5. charAt()
        System.out.println("Huruf pertama: " + namaBersih.charAt(0));
        // 6. substring()
        System.out.println("Potongan nama: " + namaBersih.substring(0, 7));
        // 7. replace()
        String namaBaru = namaBersih.replace("Athiyah", "Tya");
        System.out.println("Setelah replace: " + namaBaru);
        // 8. contains()
        System.out.println("Mengandung 'Hur': "
                + namaBersih.contains("Hur"));
        // 9. startsWith()
        System.out.println("Diawali 'Athiyah': "
                + namaBersih.startsWith("Athiyah"));
        // 10. endsWith()
        System.out.println("Diakhiri 'Ainun': "
                + namaBersih.endsWith("Ainun"));
        // 11. equals()
        System.out.println("Jurusan sama dengan Informatika: "
                + jurusan.equals("Informatika"));
        // 12. equalsIgnoreCase()
        System.out.println("Jurusan sama tanpa memperhatikan huruf besar/kecil: "
                + jurusan.equalsIgnoreCase("INFORMATIKA"));
        // 13. indexOf()
        System.out.println("Posisi huruf 'H': "
                + namaBersih.indexOf("H"));
        // 14. concat()
        String identitas = namaBersih.concat(" - ").concat(jurusan);
        System.out.println("Identitas: " + identitas);
        // 15. isEmpty()
        String kosong = "";
        System.out.println("Apakah String kosong: " + kosong.isEmpty());
    }
}