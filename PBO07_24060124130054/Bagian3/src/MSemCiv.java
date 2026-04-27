//Nama    : Raffie Aditya Akbar
//NIM   : 24060124130054
//Tanggal: 27 April 2025

public class MSemCiv {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("198001012010011001", "Dr. Agus Santoso");
        Dosen d2 = new Dosen("197505152005012002", "Dr. Budi Rahayu");
 
        Mahasiswa2 mhs1 = new Mahasiswa2("L0001", "Citra Dewi");
        Mahasiswa2 mhs2 = new Mahasiswa2("L0002", "Dimas Prasetyo");
        Mahasiswa2 mhs3 = new Mahasiswa2("L0003", "Eka Putri");
        Mahasiswa2 mhs4 = new Mahasiswa2("L0004", "Fajar Nugroho");
        Mahasiswa2 mhs5 = new Mahasiswa2("L0005", "Gita Purnama");
 
        mhs1.setWali(d1);
        mhs2.setWali(d1);
        mhs3.setWali(d2);
        mhs4.setWali(d2);
        mhs5.setWali(d1);
 
        Seminar seminar = new Seminar();
 
        System.out.println("=== Registrasi Peserta ===");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);
 
        System.out.println("\nTotal peserta seminar: " + seminar.countPeserta());
 
        seminar.tampilPeserta();
 
 
        System.out.println("Jumlah peserta mahasiswa: " + seminar.countMahasiswa());
 
        System.out.println("\n=== Data Lengkap Mahasiswa ===");
        Mahasiswa2[] listMhs = {mhs1, mhs2, mhs3, mhs4, mhs5};
        for (Mahasiswa2 m : listMhs) {
            m.tampilDataMahasiswa();
            System.out.println();
        }
    }
}
