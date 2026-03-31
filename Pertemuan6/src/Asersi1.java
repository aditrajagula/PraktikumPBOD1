public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x < 0) {
            System.out.println("Bilangan positif");
        }
        else {
            assert(x < 0);
            System.out.println("Bilangan negatif");
        }
    }
}
