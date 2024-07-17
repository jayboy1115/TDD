import java.util.Scanner;

public class EvenScore {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
   
	int scores = 0;
	int counter;
	int EvenScore = 0;

	for(counter = 1; counter <= 10; counter++) {
          System.out.println("Enter a score: ");
	    scores = input.nextInt();
      
          
       if (counter % 2 == 0) {
	System.out.printf("tne even score are %d", + EvenScore);
   }
 }
}
}	   