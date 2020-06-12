package calculator;

import Interface.CalculatorInt;

public class Calculator implements CalculatorInt {

	public double add(int a, int b) {
		double result =0;

		result = a+b;

		return result;


	}

	public double substraction(int a, int b) {
		// TODO Auto-generated method stub
		double result = 0;
		result = a-b;

		return result;
	}

	public double multiplication(int a, int b) {
		// TODO Auto-generated method stub
		double result = 0;
		result = a*b;

		return result;

	}

	public double division(int a, int b) {
		// TODO Auto-generated method stub
		double result = 0;
		result = a/b;

		return result;

	}
   
	public void longCalculation() {
		try {
		    // Attendre 2 secondes
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
