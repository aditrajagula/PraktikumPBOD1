import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    //Attribut
    private String nip;
    private static int counterPNS;

    //Method

    //Konstruktor
    public PNS() {
        super();
        this.nip = "#";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tmk, String alamat, double pendapatan, String nip) {
        super(nama, tmk, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //Selektor
    public String getNip() { 
        return nip; 
    }

    //Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(getTgl_mulai_kerja(), LocalDate.now()).getYears() + 4;
    }
    
}
