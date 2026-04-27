//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class MCoercion {
    public static void main(String[] args) {
        int nilai = 65;
        
        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        double real = (double) nilai;
        int kembali = (int) real;
        System.out.println("Kembali ke Integer: " + kembali);

        String X = "1234";
        String Y = "5678";

        String S = X + Y; // konkatenasi
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (concat): " + S);
        System.out.println("Z (jumlah): " + Z);

        String P = "12.34";
        String Q = "56.78";

        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q); 

        System.out.println("R (concat): " + R);
        System.out.println("D (jumlah): " + D);

        int A = Integer.parseInt(S);
        System.out.println("A (dari S): " + A);

        String T = Integer.toString(A);
        System.out.println("T (dari A): " + T);
    }
}