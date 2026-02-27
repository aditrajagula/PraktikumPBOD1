/* Nama File    : MGaris.java */
/* Deskripsi    : Kelas Titik yang merepresentasikan sebuah titik dalam bidang dua dimensi */
/* Pembuat      : Raffie Aditya Akbar - 24060124130054 */
/* Tanggal      : 27 Februari 2026*/

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Titik T3 = new Titik(1, 1);
        Titik T4 = new Titik(3, 5);

        
        Garis G1 = new Garis(T1, T2);
        Garis G2 = new Garis(T3, T4);

        G1.getTitikAwal().printTitik();
        G1.getTitikAkhir().printTitik();
        System.out.println("Total garis: " + Garis.getCounterGaris());

        System.out.println("Panjang garis G2: " + G2.panjangGaris());

        G2.titikTengah().printTitik();

        System.out.println(G1.isGarisSejajar(G2));
        System.out.println(G1.isGarisTegakL(G2));

        G1.printTawalTakhir();
        G2.printTawalTakhir();

        System.out.println(G2.persamaanGaris());



    }
}
