//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
public class Mbangun {
    public static void main(String[] args) {
        //BangunDatar B1 = new BangunDatar(); tidak bisa menginisialisasi objek langsung menggunakan abstrak bangundatar
        //BangunDatar P1 = new Persegi(10); compiler mengira ini bangun datar sehingga beberapa fungsi dari class
        //persegi tidak bisa digunakan
        //BangunDatar L1 = new Lingkaran(7); compiler mengira ini bangun datar sehingga beberapa fungsi dari class
        //lingkaran tidak bisa digunakan
        Persegi P1 = new Persegi(5);
        Persegi P2 = new Persegi(5);
        Lingkaran L1 = new Lingkaran (14);


        System.out.println("Panjang sisi P1: " + P1.getSisi());
        P1.setSisi(6);
        System.out.println("Panjang sisi P1 baru: " + P1.getSisi());
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        System.out.println("Diagonal P1: " + P1.getDiagonal());

        System.out.println("Panjang jari L1: " + L1.getJari());
        L1.setJari(8);
        System.out.println("Panjang sisi L1 baru: " + L1.getJari());
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L1: " + L1.getKeliling());

        System.out.println("Apakah luas P1 sama dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah keliling P1 sama dengan L1? " + P1.isEqualKeliling(L1));
        
        System.out.println("\n");
        System.out.println("Sisi lama P1 " + P1.getSisi());
        P1.zoomOut();
        System.out.println("Sisi baru P1 " + P1.getSisi());

        System.out.println("\n");
        System.out.println("Jari-jari lama L1 " + L1.getJari());
        L1.zoomOut();

        BangunDatar.printCounterBangunDatar();
    }
}
