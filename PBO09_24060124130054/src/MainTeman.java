// Nama : Raffie Aditya Akbar
// NIM  : 24060124130054
// Tanggal : 12 Mei 2026

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Andi");
        t.addNama("Budi");
        t.addNama("Andi");
        t.addNama("Caca");

        t.showTeman();

        System.out.println();
        System.out.println("Jumlah elemen : " + t.getNbelm());
        System.out.println("Apakah Budi member? " + t.isMember("Budi"));
        System.out.println("Jumlah nama Andi : " + t.countNama("Andi"));

        t.gantiNama("Budi", "Doni");

        System.out.println();
        System.out.println("Setelah ganti nama:");
        t.showTeman();

        t.delNama("Andi");

        System.out.println();
        System.out.println("Setelah hapus Andi:");
        t.showTeman();
    }
}