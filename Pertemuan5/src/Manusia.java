import java.time.LocalDate;

public abstract class Manusia {
    //Atribut
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns;

    //Method

    //Konstruktor
    public Manusia() {
        this.nama = "#";
        this.tgl_mulai_kerja = null;
        this.alamat = "#";
        this.pendapatan = 0;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tmk, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tmk;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //Selektor
    public String getNama() { 
        return nama; 
    }

    public LocalDate getTgl_mulai_kerja() { 
        return tgl_mulai_kerja; 
    }

    public String getAlamat() { 
        return alamat; 
    }

    public double getPendapatan() { 
        return pendapatan; 
    }

    //Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(LocalDate tmk) {
        this.tgl_mulai_kerja = tmk;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
    
}
