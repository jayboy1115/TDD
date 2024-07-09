import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageCalculatorTest {

	@Test
	public void testCanCalculateMilesPerGallon(){

		//given
	    GasMileageCalculator calculator = new GasMileageCalculator();
		//when
	    double numberOfMilesDriven = 30.00;
	    double numberOfGallons = 20;
	    double milesPerGallon = calculator.milesPerGallon(numberOfMilesDriven, numberOfGallons);
		//assert
	    assertEquals(1.5, milesPerGallon);
  }
	@Test
	public void testCanCalculateMilesPerGallon2(){

		//given
	    GasMileageCalculator calculator = new GasMileageCalculator();
		//when
	    double numberOfMilesDriven = 30.00;
	    double numberOfGallons = 2;
	    double milesPerGallon = calculator.milesPerGallon(numberOfMilesDriven, numberOfGallons);
		//assert
	    assertEquals(10.00, milesPerGallon);
  }

	

} 