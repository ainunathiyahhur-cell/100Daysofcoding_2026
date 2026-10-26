public class day55 {
public static void main(String[] args) {

    System.out.println("=== CONTINUE ===");
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue;
        }
        System.out.println(i);
    }
    System.out.println("\n=== BREAK ===");
    for (int i = 1; i <= 5; i++) {
        if (i == 4) {
            break;
        }
        System.out.println(i);
    }
    System.out.println("\n=== RETURN ===");
    int hasil = hitung(10, 5);
    System.out.println("Hasil penjumlahan: " + hasil);
}
static int hitung(int a, int b) {
    return a + b;
}

}
