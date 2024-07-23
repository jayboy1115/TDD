import java.util.Scanner;

public class RoadTaxCalculator {
    public static void main(String[] args) {

	double result = taxCalculator(1_000_000);
	System.out.print(result);


	}





	public static double taxCalculator(double carPrice){

	        double roadTax;
        if (carPrice < 1000000) {
            roadTax = carPrice * 0.10;
        } else if (carPrice >= 1000000 && carPrice < 3000000) {
            roadTax = carPrice * 0.15;
        } else if (carPrice >= 3000000 && carPrice < 5000000) {
            roadTax = carPrice * 0.20;
        } else {
            roadTax = carPrice * 0.25;
        }

        return roadTax;

        
    }

	
}
