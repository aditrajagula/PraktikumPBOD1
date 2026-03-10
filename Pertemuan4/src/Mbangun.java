// Nama: Raffie Aditya Akbar
// NIM : 24060124130054
public class Mbangun {
    public static void main(String[] args) {
        
        // Bagian 1
        // Nomor 2
        /*Konstruktor berparameter pada kelas persegi tidak dapat direalisasikan
        karena ateribut seperti jmlSisi, warna, dan border memiliki acces modifier private
        sehingga hanya bisa digunakan pada class BangunDatar sendiri.*/
        
        // Nomor 3
        Persegi P1 = new Persegi(5,"Hijau", "Hitam");
        Lingkaran L1 = new Lingkaran(14, "Merah", "Hitam");

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

        //Bagian 3
        BangunDatar.printCounterBangunDatar();
        //Nomor 2
        /*printCounterBangunDatar tidak bisa pada class persegi dan lingkaran karena counterBangunDatar
        merupakan atribut private static kepunyaan class BangunDatar */

        //Bagian4
        /*Bisa, karena atribut BangunDatar sudah bukan private sehingga bisa diakses oleh 
        class anak*/

        //Bagian5 
        //Nomor 1
        /*Terjadi error pada terminal dimana method dari class BangunDatar tidak bisa dipanggil di class persegi
        dan class lingkaran*/
        //Nomor 2
        /*Terjadi error pada terminal dimana jika final diletakkan pada method pada class induk sudah final maka tidak bisa dilakukan overriding*/
    }
}
