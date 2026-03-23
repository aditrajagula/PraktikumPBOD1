//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
public class Persegi extends BangunDatar implements IResize {
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

    public Persegi(double sisi) {
        this.sisi = sisi;
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
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

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }
}
