public class TransaksiTabungan {
    public static void main(String[] args) {

        double saldo = 250000;
        System.out.println("Saldo awal: Rp" + saldo);

        saldo += 50000;
        System.out.println("Setelah menerima uang: Rp" + saldo);
      
        saldo -= 45000;
        System.out.println("Setelah membeli buku: Rp" + saldo);

        double bunga = 1;
        saldo *= bunga;
        System.out.println("Setelah bunga: Rp" + saldo);
    }
}
