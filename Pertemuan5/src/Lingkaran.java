//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String Border) {
        super(0, warna, Border);
        this.jari = diameter / 2;
    }

    public Lingkaran(double jari) {
        this.jari = jari;
        setJmlSisi(0);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double Jari) {
        this.jari = Jari;
    }

    @Override
    public double getLuas() {
        return (22 / 7) * this.jari * this.jari; 
    }

    @Override
    public double getKeliling() {
        return (22 / 7) * this.jari * 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + jari);
    }

    /* 
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
    }
    */

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}
