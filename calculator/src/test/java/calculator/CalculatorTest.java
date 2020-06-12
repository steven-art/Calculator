package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	@DisplayName("test of addition")
	void testAddTxoPositiveNumbers() {
		//ARRANGE
		int a = 1;
		int b = 6;
		Calculator calculator= new Calculator();
		
		//ACT
		int somme = calculator.add(a,b);
		
		//ASSERT
		assertEquals(7,somme);
		
	}

}
