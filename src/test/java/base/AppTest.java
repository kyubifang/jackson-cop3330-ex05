package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_numbers_and_coversions() {
        App myApp = new App();
        String numOne = "10";
        String numTwo = "5";
        int intOne = Integer.parseInt(numOne);
        int intTwo = Integer.parseInt(numTwo);
        int add = intOne + intTwo;
        int subtract = intOne - intTwo;
        int multiply = intOne * intTwo;
        int divide = intOne / intTwo;

        String expectedOutput = """
                10 + 5 = 15
                10 - 5 = 5
                10 * 5 = 50
                10 / 5 = 2""";
        String actualOutput = myApp.generateOutputString(numOne, numTwo, add, subtract, multiply, divide);

        assertEquals(expectedOutput, actualOutput);
    }
}