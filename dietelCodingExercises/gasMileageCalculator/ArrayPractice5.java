import java.util.Scanner;

public class PrintScores0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        int[] numbers = new int[10];

        for (int num = 0; num < 10; num++) {
            numbers[num] = scanner.nextInt();
        }

        System.out.println("Numbers entered: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
     }
}
