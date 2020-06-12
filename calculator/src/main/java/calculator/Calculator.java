package calculator;

import java.util.HashSet;
import java.util.Set;

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
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}

	public Set<Integer> digitsSet(int number) {
		final Set<Integer> integers = new HashSet<Integer>();
		final String numberString = String.valueOf(number);
		for(int i = 0; i< numberString.length(); i++) {
			if (numberString.charAt(i) != '-') {
				integers.add(Integer.parseInt(numberString, i, i+1, 10));
			}
		}
		return integers;

	}



}
