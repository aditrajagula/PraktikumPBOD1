//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public abstract class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double W) {
        super(nama);
        this.bobot = W;
    }

    public double getBobot() {
        return this.bobot;
    }

    public void setBobot(int W) {
        this.bobot = W;
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