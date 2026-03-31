//Nama: Raffie Aditya Akbar
//NIM : 24060124130054
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];

        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        finally{
            System.out.println("Clean up code...");
        }
    }
}
