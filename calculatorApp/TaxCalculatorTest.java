import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TaxCalculatorTest{

	@Test
	public void testThatMyFunctionCanMultiplyTwoNumbers(){
		
	RoadTaxCalculator johnson = new RoadTaxCalculator();

	double result = johnson.taxCalculator(1_000_000);
	
	assertEquals(result, 150_000);

	}



}