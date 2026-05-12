public class Main {
    public static void main(String[] args) {
        System.out.println("=== BAGIAN I: DATUM ===");
        Datum<Kucing> d = new Datum<>();
        d.setIsi(new Anggora("Snowy", 4.5));
        System.out.println("Isi Datum: " + d.getIsi().getNama() + " (" + d.getIsi().getBobot() + "kg)\n");

        System.out.println("=== BAGIAN II: OPERATOR ===");
        Anabul[] pets = { new Anjing("Doggy"), new Anggora("Kitty", 3.0) };
        System.out.println("Sebelum Tukar: " + pets[0] + ", " + pets[1]);
        OperatorGenerik.Tukar(pets);
        System.out.println("Sesudah Tukar: " + pets[0] + ", " + pets[1]);
        
        double total = OperatorGenerik.Bobot2(new Anggora("A1", 2.0), new Kembangtelon("K1", 3.0));
        System.out.println("Total Bobot: " + total + "kg\n");

        System.out.println("=== BAGIAN III: DATA ===");
        Data<Anabul> list = new Data<>();
        list.setIsi(1, new Anggora("Sasha", 4.0));
        list.setIsi(2, new Anjing("Buddy"));
        System.out.println("Data posisi 1: " + list.getIsi(1).getNama());
        System.out.println("Size efektif: " + list.getSize());
    }
}