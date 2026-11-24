public class day84 {
    public static void main(String[] args) {

        int[] angka = {10, 25, 7, 40, 15};

        int maksimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        System.out.println("Angka maksimal = " + maksimal);
    }
}