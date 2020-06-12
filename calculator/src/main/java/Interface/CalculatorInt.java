package Interface;

public interface CalculatorInt {


	/**
	 * this methode have to roles to return the somme of 2 attribute and take two parameteres
	 * @param a
	 * @param b
	 * @return somme of a plus b
	 */
	double add(int a, int b);

	/**
	 * 
	 * @param a
	 * @param b
	 * @return substration of a and b
	 */
	double substraction(int a, int b);

	/**
	 * 
	 * @param a
	 * @param b
	 * @return result of a multiplied by b
	 */
	double multiplication(int a, int b);
	/**
	 * 
	 * @param a
	 * @param b
	 * @return result of a divided by b
	 */
	double division(int a, int b);
}
