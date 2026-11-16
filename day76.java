public class day76 {
    public static void main(String[] args) {

        String nama = "  Athiyah Hur Ainun  ";

        String hasilTrim = nama.trim();

        String hasilSubstring = hasilTrim.substring(0, 8);

        String hasilReplace = hasilTrim.replace("athiyah", "tya");

        System.out.println("String awal       : [" + nama + "]");
        System.out.println("Setelah trim      : [" + hasilTrim + "]");
        System.out.println("Setelah substring : " + hasilSubstring);
        System.out.println("Setelah replace   : " + hasilReplace);
    }
}