//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class Coercion {
    public static void main(String[] args) {
        // a. Integer ke berbagai tipe
        int nilai = 65;

        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        // b. Double kembali ke Integer
        double real = (double) nilai;
        int kembali = (int) real;
        System.out.println("Kembali ke Integer: " + kembali);

        // c. String X dan Y
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (concat): " + S);
        System.out.println("Z (jumlah): " + Z);

        // d. String double
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R (concat): " + R);
        System.out.println("D (jumlah): " + D);

        // e. Konversi S ke Integer
        int A = Integer.parseInt(S);
        System.out.println("A: " + A);

        // f. Integer ke String
        String T = Integer.toString(A);
        System.out.println("T: " + T);
    }
}