/* Nama File    : Titik.java */
/* Deskripsi    : Kelas Titik yang merepresentasikan sebuah titik dalam bidang dua dimensi */
/* Pembuat      : Raffie Aditya Akbar - 24060124130054 */
/* Tanggal      : 20 Februari 2026*/
public class Titik {
    /*******************ATRIBUT******************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*******************METHOD******************/
    //konstruktor untuk membuat titik(0,0)
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat titik nilai(x,y)
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return this.absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return this.ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        this.absis = x;
    }

    //mengeset absis titik dengan nilai baru y
    void setOrdinat(double y){
        this.ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
    } 

    static int getCounterTitik(){
        return counterTitik;
    }

    void printCounterTitik(){
        System.out.println(getCounterTitik());
    }

    //mengembalikan kuadran suatu titik
    int getKuadran(){
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

    double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow((this.absis + T.absis), 2) + Math.pow((this.ordinat + T.ordinat), 2));
    }

    void refleksiX(){
        this.ordinat = this.ordinat * - 1;
    }

    void refleksiY(){
        this.absis = this.absis * - 1;
    }

    Titik getRefleksiX(){
        Titik T = new Titik(absis, ordinat * - 1);
        return T;
    }

    Titik getRefleksiY(){
        Titik T = new Titik(absis * - 1, ordinat);
        return T;
    }
}