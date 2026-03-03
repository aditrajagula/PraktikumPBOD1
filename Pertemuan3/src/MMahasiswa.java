//Nama    : Raffie Aditya Akbar
//NIM  	  : 24060124130054
//Tanggal : 3 Maret 2026
public class MMahasiswa {

    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("4031", "Ayuma", "Informatika");
        Dosen D1 = new Dosen("234", "Dandi", "Informatika");
        Kendaraan K1 = new Kendaraan("B1245UDU", "motor");
        M1.setDosenWaliMhs(D1);
        M1.setkendaraan(K1);
        M1.addMatKul(MBD);
        M1.addMatKul(PBO);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSks());
    }
}