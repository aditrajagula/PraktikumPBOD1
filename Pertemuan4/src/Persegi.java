// Nama: Raffie Aditya Akbar
// NIM : 24060124130054
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        this.jmlsisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }
    
    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    /* 
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
    */

    /*
    @Override
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Persegi: " + CounterBangunDatar);
    } */
}
