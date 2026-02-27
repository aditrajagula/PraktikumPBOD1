/* Nama File    : Garis.java */
/* Deskripsi    : Kelas Titik yang merepresentasikan sebuah titik dalam bidang dua dimensi */
/* Pembuat      : Raffie Aditya Akbar - 24060124130054 */
/* Tanggal      : 27 Februari 2026*/

public class Garis {
    /*******************ATRIBUT******************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris;

    /*******************METHOD******************/
    //Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis(){
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    //Konstruktor dengan parameter masukan titik awal dan titik akhir
    public Garis(Titik tAwal, Titik tAkhir){
        this.titikAwal = tAwal;
        this.titikAkhir = tAkhir;
        counterGaris++;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double panjangGaris() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public Titik titikTengah(){
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        Titik T = new Titik((x1 + x2) / 2, (y1 + y2) / 2);
        return T;
    }

    public boolean isGarisSejajar(Garis G){
        double grad1 = (this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat()) / (this.titikAkhir.getAbsis() - this.titikAwal.getAbsis());
        double grad2 = (G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat()) / (G.titikAkhir.getAbsis() - G.titikAwal.getAbsis());
        if (grad1 == grad2) {
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean isGarisTegakL(Garis G){
        double grad1 = (this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat()) / (this.titikAkhir.getAbsis() - this.titikAwal.getAbsis());
        double grad2 = (G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat()) / (G.titikAkhir.getAbsis() - G.titikAwal.getAbsis());
        if (grad1 * grad2 == -1) {
            return true;
        } 
        else {
            return false;
        }
    }

    public void printTawalTakhir(){
        System.out.print("Titik awal: ");
        this.titikAwal.printTitik();      
        System.out.print("Titik akhir: ");
        this.titikAkhir.printTitik();  
    }

    public String persamaanGaris(){
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();
        if (x1 == x2) {
            return "x = " + x1;
        }
        else {
            double grad = (y2 - y1) / (x2 - x1);
            double c = y1 - (grad * x1);
            if (c >= 0) {
                return "y = " + grad + "x + " + c;
            }
            else {
                return "y = " + grad + "x - " + (-c);
            }
        }
    }
}
