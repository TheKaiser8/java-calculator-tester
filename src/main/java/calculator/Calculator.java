package calculator;

public class Calculator {
    // METHODS
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) throws IllegalArgumentException {
        if (isZero(num2)) {
            throw new IllegalArgumentException("Impossibile dividere per zero!");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    // private methods
    private boolean isZero(float num) {
        return num == 0;
    }
}
