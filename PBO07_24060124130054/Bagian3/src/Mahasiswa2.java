//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class Mahasiswa2 extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;
 
    public Mahasiswa2(String nim, String nama) {
        super(nama);
        this.nim = nim;
        this.dosenWali = null;
    }
 
    public String getNim() { 
        return nim; 
    }
 
    @Override
    public String getNomor() { 
        return nim; 
    }
 
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }
 
    public void tampilDataMahasiswa() {
        System.out.println("NIM            : " + nim);
        System.out.println("Nama Mahasiswa : " + nama);
        if (dosenWali != null) {
            System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println("Nama Dosen Wali: (belum ditentukan)");
        }
    }
}