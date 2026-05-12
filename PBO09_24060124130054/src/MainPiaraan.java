// Nama : Raffie Aditya Akbar
// NIM  : 24060124130054
// Tanggal : 12 Mei 2026

public class MainPiaraan {
    public static void main(String[] args) {

        Piaraan p = new Piaraan();

        Kucing k1 = new Kucing("Milo", 4.5);
        Kucing k2 = new Kucing("Oyen", 3.2);
        Anjing a1 = new Anjing("Doggy", 8.0);
        Burung b1 = new Burung("Rio", 1.1);

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        p.showAnabul();

        System.out.println();
        p.showJenisAnabul();

        System.out.println();
        System.out.println("Jumlah kucing : " + p.countKucing());
        System.out.println("Total bobot kucing : " + p.bobotKucing());

        System.out.println();
        System.out.println("Anabul pertama : " + p.getAnabul().getNama());

        p.dequeueAnabul();

        System.out.println();
        System.out.println("Setelah dequeue:");
        p.showAnabul();
    }
}