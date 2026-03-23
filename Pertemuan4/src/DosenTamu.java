//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;

class DosenTamu extends Dosen {
    //Atribut
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    //Method

    //Konstruktor
    public DosenTamu() {
        super();
        this.nidk = "#";
        this.tanggalAkhirKontrak = null;
    }
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok,
                     String fakultas, String nidk,
                     LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    //Selektor
    public String getNidk() { 
        return nidk; 
    }
    
    public LocalDate getTanggalAkhirKontrak() { 
        return tanggalAkhirKontrak; 
    }

    //Mutator
    public void setNidk(String nidk) { 
        this.nidk = nidk; 

    }
    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak) {
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    @Override
    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("NIDK : " + this.nidk);
        System.out.println("Nama : " + getNama());
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Gaji Pokok : Rp" + getGajiPokok());
        System.out.println("Tunjangan : Rp" + hitungTunjangan());
        System.out.println("Akhir Kontrak : " + formatTanggal(tanggalAkhirKontrak));
    }
}