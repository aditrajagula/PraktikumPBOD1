//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;
import java.time.Period;

class DosenTetap extends Dosen {
    //Atribut
    private String nidn;
    private static final int BUP = 65;

    //Method

    //Konstruktor
    public DosenTetap() {
        super();
        this.nidn = "#";
    }

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok,
                      String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    //Selektor
    public String getNidn() { 
        return nidn; 
    }

    //Mutator
    public void setNidn(String nidn) { 
        this.nidn = nidn; 
    }

    private String formatMasaKerja() {
        Period p = hitungMasaKerjaDetail();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    @Override
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerjaTahun() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("NIDN : " + this.nidn);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT : " + formatTanggal(getTmt()));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kerja : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun(BUP)));
        System.out.println("Gaji Pokok : Rp" + getGajiPokok());
        System.out.println("Tunjangan : Rp" + hitungTunjangan());
    }
}