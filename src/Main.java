import org.trzcinska.Suma;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for( int i= 0; i< 10; i++) {
            array[i] = i;
        }
        Suma dowolna = new Suma();

        int suma = dowolna.sumArray(array);
        System.out.println(suma);
    }
}