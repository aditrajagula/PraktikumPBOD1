//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
public abstract class BangunDatar {
    //Atribut
    private int jmlsisi;
    private String warna;
    private String border;
    private static int counterbangundatar = 0;

    //Method

    //Konstruktor
    public BangunDatar() {
        counterbangundatar++;
    }

    public BangunDatar(int sisi, String Warna, String Border) {
        this.jmlsisi = sisi;
        this.warna = Warna;
        this.border = Border;
        counterbangundatar++;
    }

    //Selektor
    public int getJmlSisi() {
        return this.jmlsisi;
    }

    public String getWarna() {
        return this.warna;
    }

    public String getBorder() {
        return this.border;
    }
    
    //Mutator
    public void setJmlSisi(int sisi) {
        this.jmlsisi = sisi;
    }

    public void setWarna(String Warna) {
        this.warna = Warna;
    }

    public void setBorder(String Border) {
        this.border = Border;
    }

    public static int getCounterBangunDatar() {
        return counterbangundatar;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + this.jmlsisi);
        System.out.println("Warna: " + this.warna);
        System.out.println("Border: " + this.border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek: " + counterbangundatar);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

}