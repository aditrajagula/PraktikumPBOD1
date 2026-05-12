// Nama : Raffie Aditya Akbar
// NIM  : 24060124130054
// Tanggal : 12 Mei 2026

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // Getter jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Enqueue
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    // Mengecek member
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // Melihat anabul pertama
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // Dequeue
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }

        return null;
    }

    // Menampilkan nama anabul
    public void showAnabul() {
        System.out.println("Daftar Anabul:");

        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    // Menghitung jumlah kucing
    public int countKucing() {
        int count = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // Menghitung total bobot kucing
    public double bobotKucing() {
        double total = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += a.getBobot();
            }
        }

        return total;
    }

        // Menampilkan nama dan jenis objek
    public void showJenisAnabul() {
        System.out.println("Daftar Jenis Anabul:");

        for (Anabul a : Lanabul) {
            System.out.println(
                a.getNama() +
                " -> " +
                a.getClass().getName()
            );
        }
    }
}
    