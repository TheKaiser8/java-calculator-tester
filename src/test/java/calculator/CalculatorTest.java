package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calc;
    private float result;

    // prima di ogni test istanzio un nuovo oggetto calc e inizializzo a 0 result
    @BeforeEach
    void init() {
        calc = new Calculator();
        result = 0;
    }

    @Test
    void add() {
        result = calc.add(2, 8);
        Assertions.assertEquals(10, result, "La somma deve essere 10");
    }

    @Test
    void subtract() {
        result = calc.subtract(12, 2);
        Assertions.assertEquals(10, result, "Il risultato della sottrazione deve essere 10");
    }

    @Test
    void divide() {
        result = calc.divide(100, 10);
        Assertions.assertEquals(10, result, "Il risultato della divisione deve essere 10");
    }

    @Test
    @DisplayName("Test fallisci divisione se il divisore è == 0")
    void failDivide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.divide(100, 0), "Deve sollevare IllegalArgumentException per divisione per zero");
    }

    @Test
    void multiply() {
        result = calc.multiply(5, 2);
        Assertions.assertEquals(10, result, "Il risultato della moltiplicazione deve essere 10");
    }
}