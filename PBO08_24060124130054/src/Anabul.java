//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public abstract class Anabul {
    protected String nama;
 
    public Anabul(String nama) {
        this.nama = nama;
    }
 
    public String getNama() { 
        return nama; 
    }
 
    public abstract void gerak();

    public abstract void bersuara();

}