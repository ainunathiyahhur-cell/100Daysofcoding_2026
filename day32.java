public class day32 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int hasil = a + b;

        boolean kondisi1 = a > b;
        boolean kondisi2 = b < 10;

        System.out.println("Hasil penjumlahan: " + hasil);
        System.out.println("a > b : " + kondisi1);
        System.out.println("b < 10 : " + kondisi2);
        System.out.println("AND : " + (a > b && b < 10));
        System.out.println("OR : " + (a > 15 || b < 10));
        System.out.println("NOT : " + !(a > b));

        a++;
        System.out.println("Setelah increment: " + a);
        b--;
        System.out.println("Setelah decrement: " + b);
    }
}
