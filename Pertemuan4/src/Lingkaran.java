// Nama: Raffie Aditya Akbar
// NIM : 24060124130054
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String Border) {
        super(0, warna, Border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double Jari) {
        this.jari = Jari;
    }

    public double getLuas() {
        return (22 / 7) * this.jari * this.jari; 
    }

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
}
