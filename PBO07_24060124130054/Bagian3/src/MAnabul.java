//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class MAnabul {
    public static void main(String[] args) {
        Anabul[] kebunBinatang = {
            new Kucing("Kitty"),
            new Anjing("Rex"),
            new Burung("Tweety"),
            new Kucing("Mochi"),
            new Anjing("Buddy")
        };
 
        System.out.println("====== Simulasi Bunyi dan Gerakan Anabul ======\n");
        for (Anabul a : kebunBinatang) {
            a.bersuara();   
            a.gerak();
            System.out.println();
        }
    }
}
 