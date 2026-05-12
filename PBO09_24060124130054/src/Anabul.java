// Nama : Raffie Aditya Akbar
// NIM  : 24060124130054
// Tanggal : 12 Mei 2026

public abstract class Anabul {
    protected String nama;
    protected double bobot;

    public Anabul(String nama, double bobot) {
        this.nama = nama;
        this.bobot = bobot;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBobot() {
        return bobot;
    }

    public abstract void gerak();
    public abstract void bersuara();
}