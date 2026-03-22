//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {

        DosenTetap dt = new DosenTetap(
                "9545647548",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika",
                "78647324"
        );

        DosenTamu dta = new DosenTamu(
                "1234567890",
                "Budi",
                LocalDate.of(1985, 3, 10),
                LocalDate.of(2020, 2, 1),
                4000000,
                "Fakultas Teknik",
                "99887766",
                LocalDate.of(2026, 12, 31)
        );

        Tendik t = new Tendik(
                "1122334455",
                "Siti",
                LocalDate.of(1995, 7, 20),
                LocalDate.of(2018, 6, 15),
                3000000,
                "Akademik"
        );

        System.out.println("=== DOSEN TETAP ===");
        dt.printInfo();

        System.out.println("\n=== DOSEN TAMU ===");
        dta.printInfo();

        System.out.println("\n=== TENDIK ===");
        t.printInfo();
    }
}