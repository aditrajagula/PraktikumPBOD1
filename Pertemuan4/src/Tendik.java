//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;
import java.time.Period;

class Tendik extends Pegawai {
    //Atribut
    private String bidang;
    private static final int BUP = 55;

    //Method

    //Konstruktor
    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    //Selektor
    public String getBidang() { 
        return bidang; 
    }

    //Mutator
    public void setBidang(String bidang) { this.bidang = bidang; }

    private String formatMasaKerja() {
        Period p = hitungMasaKerjaDetail();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    @Override
    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun(BUP)));
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan : Rp" + hitungTunjangan());
    }
}