//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class Dosen extends Civitasakademika {
    private String nip;
 
    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }
 
    public String getNip() { return nip; }
 
    @Override
    public String getNomor() { return nip; }
}