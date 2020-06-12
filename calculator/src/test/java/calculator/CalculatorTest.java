package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	private Calculator calculatorUnderTest;
	private static Instant startedAt;
	

	@BeforeEach
	public void initCalculator() {
		calculatorUnderTest =new Calculator();
		System.out.println("Appel avant chaque test");
	}

	@AfterEach
	public void undefCalculator() {
		System.out.println("Apres chaque test");
		calculatorUnderTest = null;
	}
	//pour Chonometrer les temps que tout les test ont pris à etre executer:
	
	@BeforeAll
	public static void initStartedAt() {
		System.out.println("Appel avant tous les tests");
		startedAt = Instant.now();
	}
	
	@AfterAll
	public static void stopStartedAt() {
		System.out.println("Appel apres tous les tests");
		Instant endedAt = Instant.now();
		long duration = Duration.between(startedAt, endedAt).toMillis();
		System.out.println(MessageFormat.format("Duréee des tests : {0} ms", duration));
	}
	
	@Test
	@DisplayName("test of addition")
	public void testAddToPositiveNumbers() {
		//ARRANGE
		int a = 1;
		int b = 6;


		//ACT
		double somme = calculatorUnderTest.add(a,b);

		//ASSERT
		assertEquals(7,somme);

	}
	@Test
	@DisplayName("test of  soustraction")
	public void testSubstractionToPositiveNumber() {
		//ARRANGE
		int a = 1;
		int b = 6;


		//ACT
		double substract = calculatorUnderTest.substraction(a,b);

		//ASSERT
		assertEquals(-5,substract);
	}

	@Test
	@DisplayName("test of  multiplication")
	public void testMultiplicationToPositiveNumber() {
		//ARRANGE
		int a = 2;
		int b = 5;


		//ACT
		double mult = calculatorUnderTest.multiplication(a,b);

		//ASSERT
		assertEquals(10,mult);
	}

	@Test
	@DisplayName("test of  division")
	public void testDivisionToPositiveNumber() {
		//ARRANGE
		int a = 6;
		int b = 3;


		//ACT
		double div = calculatorUnderTest.division(a,b);

		//ASSERT
		assertEquals(2.0,div);
	}
	@ParameterizedTest(name="{0} x 0 doit être égal à 0")
	@ValueSource(ints = {1,2,35,1001,98726})
	public void multiply_shouldReturnZero(int arg) {
		//ARRANGE
		
		//ACT
		double actualResult = calculatorUnderTest.multiplication(arg, 0);
		//ASSERT
		assertEquals(0, actualResult);
	}
	
	@ParameterizedTest(name="{0} + {1} doit être égal à {2}")
	@CsvSource({"1,2,3", "3,5,8", "42,2365,2407"})
	public void add_shouldReturnSum(int arg1, int arg2 , int expectResult) {
		//ARRANGE
		
		//ACT
		double actualResult = calculatorUnderTest.add(arg1, arg2);
		//ASSERT
		assertEquals(expectResult, actualResult);
	}
	@Timeout(1)
	@Test
	public void longCalcul_shouldComputeInLessThan1Second() {
		// Arrange

		// Act
		calculatorUnderTest.longCalculation();
		
		// Assert
		// ...
	}

}
