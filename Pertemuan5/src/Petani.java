//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    //Atribut
    private String asal_kota;
    private static int counterPetani;

    //Konstruktor
    public Petani() {
        super();
        this.asal_kota = "#";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tmk, String alamat, double pendapatan, String asal_kota) {
        super(nama, tmk, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //Selektor
    public String getAsal_kota() { 
        return asal_kota; 
    }

    //Mutator
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        System.out.println("--------Info Petani--------");
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal mulai kerja: " + getTgl_mulai_kerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("NIP: " + this.asal_kota);
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(getTgl_mulai_kerja(), LocalDate.now()).getYears() + 0;
    }
}
