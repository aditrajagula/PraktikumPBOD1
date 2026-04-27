//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meong!");
    }
    
}