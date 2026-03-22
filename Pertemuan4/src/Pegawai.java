//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Pegawai {
    //Atribut
    protected String nip, nama;
    protected LocalDate tanggalLahir, tmt;
    protected double gajiPokok;

    //Method

    //Konstruktor
    public Pegawai() {
        this.nip = "#";
        this.nama = "#";
        this.tanggalLahir = null;
        this.tmt = null;
        this.gajiPokok = 0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    //Selektor
    public String getNip() { 
        return nip; 
    }
    
    public String getNama() { 
        return nama; 
    }
    
    public LocalDate getTanggalLahir() { 
        return tanggalLahir; 
    }
    
    public LocalDate getTmt() { 
        return tmt; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }
    
    //Mutator
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setTanggalLahir(LocalDate tanggalLahir) { 
        this.tanggalLahir = tanggalLahir; 
    }

    public void setTmt(LocalDate tmt) { 
        this.tmt = tmt; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    public Period hitungMasaKerjaDetail() {
        return Period.between(tmt, LocalDate.now());
    }

    protected String formatTanggal(LocalDate tanggal) {
        if (tanggal == null) return "-";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(fmt);
    }

    public int hitungMasaKerjaTahun() {
        return hitungMasaKerjaDetail().getYears();
    }

    public LocalDate hitungTanggalPensiun(int bup) {
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        return 0;
    }

    public void printInfo() {
        System.out.println("Data Pegawai");
    }
}