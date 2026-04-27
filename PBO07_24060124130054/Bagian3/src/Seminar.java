//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class Seminar {
    private static final int KAPASITAS = 100;
    private Civitasakademika[] pesertas;  
    private int banyakPeserta;
 
    public Seminar() {
        pesertas = new Civitasakademika[KAPASITAS];
        banyakPeserta = 0;
    }
 
    public int countPeserta() {
        return banyakPeserta;
    }
 
    public void registrasi(Civitasakademika peserta) {
        if (banyakPeserta < KAPASITAS) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
            System.out.println("Berhasil mendaftar: " + peserta.getNama()
                    + " [" + peserta.getNomor() + "]");
        } else {
            System.out.println("Seminar penuh! " + peserta.getNama() + " tidak dapat mendaftar.");
        }
    }

        public void tampilPeserta() {
        System.out.println("\n--- Daftar Peserta Seminar ---");
        System.out.printf("%-5s %-15s %-25s%n", "No", "Nomor", "Nama");
        System.out.println("-".repeat(47));
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.printf("%-5d %-15s %-25s%n",
                    (i + 1),
                    pesertas[i].getNomor(),
                    pesertas[i].getNama());
        }
        System.out.println("-".repeat(47));
    }
 
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}