package calculatorjavadocdanielmejia;

public class CalculatorJavaDocDanielMejia {
    /**
    * Mètode que suma dos números enters.
    * @param a el primer número a sumar
    * @param b el segon número a sumar
    * @return la suma dels dos números
    */
    public int add(int a, int b) {
        return a + b;
    }
    /**
    * Mètode que suma dos números decimals
    * @param b el número del qual es vol restar
    * @param a el número que es vol restar
    * @return la diferència entre a i b
    */
    public int subtract(int a, int b) {
        return a - b;
    }
    /**
    * Mètode que multiplica dos números enters.
    * @param a el primer número a multiplicar
    * @param b el segon número a multiplicar
    * @return el producte dels dos números
    */
    public int multiply(int a, int b) {
        return a * b;
    }
    /**
    * Mètode que divideix dos números enters.
    * @param a el número que es vol dividir
    * @param b el divisor
    * @return el resultat de la divisió de a entre b
    * @throws ArithmeticException si b és 0
    */
    public int divide(int a, int b) throws ArithmeticException {
    if (b == 0) {
    throw new ArithmeticException("No es pot dividir per zero.");
    }
    return a / b;
    }
}