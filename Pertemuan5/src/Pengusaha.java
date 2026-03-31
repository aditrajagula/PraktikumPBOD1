//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    //Atribut
    private String npwp;
    private static int counterPengusaha;

    //Method

    //Konstruktor
    public Pengusaha() {
        super();
        this.npwp = "#";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tmk, String alamat, double pendapatan, String npwp) {
        super(nama, tmk, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //Selektor
    public String getNpwp() { 
        return npwp; 
    }

    //Mutator
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        System.out.println("--------Info Pengusaha--------");
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal mulai kerja: " + getTgl_mulai_kerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("NIP: " + this.npwp);
    }
    
    @Override
    public int hitungMasaKerja() {
        return Period.between(getTgl_mulai_kerja(), LocalDate.now()).getYears() + 5;
    }
}
