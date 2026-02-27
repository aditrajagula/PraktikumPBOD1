/* Nama File    : Titik.java */
/* Deskripsi    : Kelas Titik yang merepresentasikan sebuah titik dalam bidang dua dimensi */
/* Pembuat      : Raffie Aditya Akbar - 24060124130054 */
/* Tanggal      : 20 Februari 2026*/
public class Titik {
    /*******************ATRIBUT******************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*******************METHOD******************/

    /*******************Konstruktor******************/
    //konstruktor untuk membuat titik(0,0)
    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat titik nilai(x,y)
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    /*******************Selektor******************/
    //mengembalikan nilai absis
    public double getAbsis(){
        return this.absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return this.ordinat;
    }

    /*******************Mutator******************/
    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        this.absis = x;
    }

    //mengeset absis titik dengan nilai baru y
    public void setOrdinat(double y){
        this.ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
    } 

    //mengembalikan jumlah titik yang telah dikonstruksi
    public static int getCounterTitik(){
        return counterTitik;
    }

    //menampilkan di layar  jumlah titik yang telah dikonstruksi
    public void printCounterTitik(){
        System.out.println(getCounterTitik());
    }

    //mengembalikan kuadran suatu titik
    public int getKuadran(){
        if (this.absis >= 0 && this.ordinat >= 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    //mengembalikan jarak titik dengan titik O(0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    //mengembalikan jarak titik dengan titik a
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow((this.absis + T.absis), 2) + Math.pow((this.ordinat + T.ordinat), 2));
    }

    //melakukan refleksi titik terhadap sumbu x
    public void refleksiX(){
        this.ordinat = this.ordinat * - 1;
    }

    //melakukan refleksi titik terhadap sumbu y
    public void refleksiY(){
        this.absis = this.absis * - 1;
    }

    //mengembalikan titik yang sudah direfleksikan terhadap sumbu x
    public Titik getRefleksiX(){
        Titik T = new Titik(absis, ordinat * - 1);
        return T;
    }

    //mengembalikan titik yang sudah direfleksikan terhadap sumbu y
    public Titik getRefleksiY(){
        Titik T = new Titik(absis * - 1, ordinat);
        return T;
    }
}