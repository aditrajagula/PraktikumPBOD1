//Nama    : Raffie Aditya Akbar
//NIM  	  : 24060124130054
//Tanggal : 3 Maret 2026

public class MataKuliah {
    /*******************Atribut***********************/
    private String idMatKul;
    private String namaMatKul;
    private int sks;

    /*******************Method***********************/
    //Konstruktor matkul tanpa parameter
    public MataKuliah() {
        this.idMatKul = "&";
        this.namaMatKul = "&";
        this.sks = -1;
    }

    //Konstruktor matkul dengan parameter idMatKul, namaMatKul, sks
    public MataKuliah(String ID, String NamaM, int S) {
        this.idMatKul = ID;
        this.namaMatKul = NamaM;
        this.sks = S;
    } 

    //Selektor untuk mengembalikan idmatkul
    public String getIdMatKul() {
        return this.idMatKul;
    }

    //Selektor untuk mengembalikan nama matkul
    public String getNamaMatKul() {
        return this.namaMatKul;
    }

    //Selektor untuk mengembalikan sks
    public int getSks() {
        return this.sks;
    }

    //Mutator untuk mengubah idmatkul
    public void seIdMatkul(String ID) {
        this.idMatKul = ID;
    }

    //Mutator untuk mengubah nama matkul
    public void setNamaMatkul(String Nama) {
        this.namaMatKul = Nama;
    }

    //Mutator untuk mengubah prodi
    public void setSks(int S) {
        this.sks = S;
    }
}
