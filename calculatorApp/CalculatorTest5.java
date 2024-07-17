import org.junit.jupiter.api.Test;	
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest5 {

	@Test   
	//annotation : junit jupiter api gives us access to @Test used to indicate that a particular unit is a unit test
	public void testThatCalculatorCanAddTwoPositiveNumbers() {
		//given
			Calculator5 calculator = new Calculator5();
		//when
			int result = calculator.add(2, 3);
		//assert		
			assertEquals(5, result);	
	}

	@Test
	public void testCantDivideByZero(){
		//given
		Calculator5 calculator = new Calculator5();
		//when
		//int result = calculator.divide(4,0);
		//assert
		assertThrows(ArithmeticException.class, ()->calculator.divide(4,0)); 
		// exceptions are called errors in code. the program can recover from exceptions but not errors.
	}

	@Test
	public void ls(){
		Calculator5 calculator = new Calculator5();
		int result = calculator.multiply(2, 3);
		assertEquals(6, result);
	
	}

	@Test
	public void testSubtract(){
		Calculator5 calculator = new Calculator5();
		int result = calculator.subtract(2, 3);
		assertEquals(-1, result);
	}

	@Test
	public void testDivide(){
		Calculator5 calculator = new Calculator5();
		int result = calculator.divide(6, 2);
		assertEquals(3, result);
	}
	

	@Test
	public void TestNumbersMultiply(){
		Calculator5 calculator = new Calculator5();
		
		int number1 = -5;
		int number2 = -4;

		int product = calculator.multiplication(number1, number2);
		assertEquals(20, product);


	}




}