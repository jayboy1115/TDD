public class Calculator5{


	public int add(int firstNumber, int secondNumber){

		int sum = firstNumber + secondNumber;
		return sum;

	}

	public int multiply(int firstNumber, int secondNumber){

		int multiply = firstNumber * secondNumber;
		return multiply;
	}

	
	public int subtract(int firstNumber, int secondNumber){

		int subtract = firstNumber - secondNumber;
		return subtract;
	}


	public int divide(int firstNumber, int secondNumber){

		int divide = firstNumber / secondNumber;
		return divide;
	}

	
	public int multiplication(int number1, int number2){

		int result =0;		
		if(number1 == 0 || number2 == 0){
			return result;
		}
		
		if(number1 > 0 && number2 < 0){
			for(int counter = 0; counter < -number2; counter++){
				result -= number1;
			}
				return result;
		}
		else if(number1 < 0 && number2 < 0){
			for(int count = 0; count < -number2; count++){
				result -= number1;
			}
			return result;
		}

		else if(number1 < 0 && number2 > 0){
			for(int count = -1; count >= number1; count--){
				result -= number2;
			}
			return result;
		}

		else {
			for(int count = 0; count < number2; count++){
				result += number1;
			}
			return result;
		}
			

	}



}