public class Data<T> {
    private Object[] ruang = new Object[100]; 
    private int banyak = 0;

    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = objek;
            if (posisi > banyak) banyak = posisi;
        }
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        return (T) ruang[posisi - 1];
    }

    public int getSize() { return banyak; }
}