//Nama    : Raffie Aditya Akbar
//NIM  	  : 24060124130054
//Tanggal : 3 Maret 2026

public class Kendaraan {
    /*******************Atribut***********************/
    private String noPlat;
    private String jenis;

    /*******************Method***********************/
    //Konstruktor kendaraan tanpa parameter
    public Kendaraan() {
        this.noPlat = "&";
        this.jenis = "&";
    }

    //Konstruktor kendaraan tanpa parameter dengan jenis antara mobil atau motor
    public Kendaraan(String NO, String Jenis) {
        this.noPlat = NO;
        this.jenis = Jenis;
    }

    //Selektor untuk mengembalikan nomor plat
    public String getNoPlat() {
        return this.noPlat;
    }

    //Selektor untuk mengembalikan jenis kendaraan;
    public String getJenis() {
        return this.jenis;
    }

    //Mutator untuk mengubah nomor plat
    public void setNoPlat(String NO) {
        this.noPlat = NO;
    }

    //Mutator untuk mengubah nomor plat
    public void setJenis(String Jenis) {
        this.jenis = Jenis;
    }
}
