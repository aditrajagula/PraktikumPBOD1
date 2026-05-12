// Nama : Raffie Aditya Akbar
// NIM  : 24060124130054
// Tanggal : 12 Mei 2026

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // Getter jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Getter nama berdasarkan indeks
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // Setter nama berdasarkan indeks
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // Menambah nama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // Menghapus nama
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // Mengecek member
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Mengganti nama
    public void gantiNama(String nama, String namaBaru) {
        int idx = Lnama.indexOf(nama);

        if (idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    // Menghitung jumlah nama tertentu
    public int countNama(String nama) {
        int count = 0;

        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }

        return count;
    }

        // Menampilkan semua teman
    public void showTeman() {
        System.out.println("Daftar Teman:");

        for (String n : Lnama) {
            System.out.println("- " + n);
        }
    }
}