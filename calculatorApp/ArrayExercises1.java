import java.util.Arrays;

public class ArrayExercises1 {
    public static void main(String[] args) {

        int[] collection = new int[10];
        for (int count = 0; count < 10; count++) {
            collection[count] = count + 1; 
        }
        int sum = 0;
        for (int number : collection) {
            sum += number; 
        }
	double average = (double) sum / collection.length;

        System.out.println(Arrays.toString(collection));
        System.out.println("Sum: " + sum);
	System.out.println("Average: " + average);
    }
}

