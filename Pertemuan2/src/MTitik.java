public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = T1;
        Titik T3 = new Titik(5, 7);

        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T2.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        T3.printTitik();

        T2.printTitik();
        T2.setAbsis(10);
        T2.setOrdinat(10);
        T2.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());


        System.out.println(T1.getKuadran());
        System.out.println(T2.getKuadran());
        System.out.println(T3.getKuadran());
        
        System.out.println(T3.getJarakPusat());
        System.out.println(T2.getJarak(T3));

        T3.refleksiX();
        T3.printTitik();
        T1.refleksiY();
        T1.printTitik();

        (T3.getRefleksiX()).printTitik();
        (T1.getRefleksiY()).printTitik();
    }
}
