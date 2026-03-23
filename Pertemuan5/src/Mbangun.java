public class Mbangun {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(4);
        Lingkaran L1 = new Lingkaran(7);


        P1.zoomIn();
        L1.zoomOut();

        P1.printInfo();
        L1.printInfo();
    }
}