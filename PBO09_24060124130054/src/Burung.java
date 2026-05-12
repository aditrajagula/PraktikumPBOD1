//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class Burung extends Anabul {

    public Burung(String nama, double bobot) {
        super(nama, bobot);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) bersuara: Cuit!");
    }
    
}