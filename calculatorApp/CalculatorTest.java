import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

       @Test
       public void testThatCalculatorCanAddTwoPositiveNumbers(){

		//given
		Calculator calculator = new Calculator();
		//when
		int result = calculator.add(2, 3);
		//assert
		assertEquals(5, result);
}
	 

	@Test
       public void testThatCalculatorCanSubtractTwoPositiveNumbers(){

		//given
		Calculator calculator = new Calculator();
		//when
		int result = calculator.subtract(3, 2);
		//assert
		assertEquals(1, result);
}

	@Test
       public void testThatCalculatorCanDivideTwoPositiveNumbers(){

		//given
		Calculator calculator = new Calculator();
		//when
		int result = calculator.divide(4, 2);
		//assert
		assertEquals(2, result);
}


}