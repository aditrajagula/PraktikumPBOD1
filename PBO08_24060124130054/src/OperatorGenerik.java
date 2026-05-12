public class OperatorGenerik {
    public static <T> void Tukar(T[] arr) {
        if (arr.length >= 2) {
            T temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
