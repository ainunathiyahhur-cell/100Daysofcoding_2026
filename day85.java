public class day85 {
    public static void main(String[] args) {

        int[] angka = {1, 5, 4, 2, 3, 1};

        int minimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }

        System.out.println("Angka minimal = " + minimal);
    }
}