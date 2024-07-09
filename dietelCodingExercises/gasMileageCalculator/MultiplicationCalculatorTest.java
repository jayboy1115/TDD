import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationCalculatorTest {

	@Test
	public void testCanMultiply(){

		//given
	MultiplicationCalculator multiplication = new MultiplicationCalculator();

		//when
	int numbOne = 8;
	int numbTwo = -5;
	
	int result = multiplication.calculator(8, -5);

		//assert 
	assertEquals(-40, result);

	
	

    }
}

