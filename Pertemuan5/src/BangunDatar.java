//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
public abstract class BangunDatar {
    protected int jmlsisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;


    public BangunDatar () {
        counterBangunDatar++;
    }

    public BangunDatar (int Jmlsisi, String warna, String border) {
        this.jmlsisi = Jmlsisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi () {
        return jmlsisi;
    }

    public void setJmlSisi (int jmlSisi) {
        this.jmlsisi = jmlSisi;
    }

    public String getWarna () {
        return warna;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String Border) {
        this.border = Border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlsisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}
