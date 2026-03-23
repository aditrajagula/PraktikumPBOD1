//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;

class Dosen extends Pegawai {
    //Atribut
    private String fakultas;

    //Method

    //Konstruktor
    public Dosen() {
        super();
        this.fakultas = "#";
    }
    public Dosen(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    //Selektor
    public String getFakultas() { 
        return fakultas; 
    }

    //Mutator
    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }
}