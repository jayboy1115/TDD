import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        int[] collection = new int[10];

        for (int count = 0; count < 10; count++) {
            collection[count] = count + 1; 
        }
        System.out.println(Arrays.toString(collection));
    }
}
