public class TukarNilai {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sementara;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
      
        sementara = a;
        a = b;
        b = sementara;

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
