
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "Jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
}

/*Penggunaan asersi pada program Asersi2 kurang tepat karena asersi digunakan untuk
memvalidasi input dari luar yaitu jari jari lingkaran. Seharusnya asersi digunakan untuk
\memastikan kondisi internal program dan bukan menangani error input user. */