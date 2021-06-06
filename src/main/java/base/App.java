/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 5 - Simple Math

        You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

        Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:
        Example Output

        What is the first number? 10
        What is the second number? 5
        10 + 5 = 15
        10 - 5 = 5
        10 * 5 = 50
        10 / 5 = 2

        Constraints

        Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
        Keep the inputs and outputs separate from the numerical conversions and other processing.
        Generate a single output statement with line breaks in the appropriate spots.

        Challenges

        Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
        Don’t allow the user to enter a negative number.
        Break the program into functions that do the computations.
        Implement this program as a GUI program that automatically updates the values when any value changes.
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String numOne = myApp.readNumOne();
        String numTwo = myApp.readNumTwo();
        int add = myApp.addition(numOne, numTwo);
        int subtract = myApp.subtraction(numOne, numTwo);
        int multiply = myApp.multiplication(numOne, numTwo);
        int divide = myApp.division(numOne, numTwo);
        String outputString = myApp.generateOutputString(numOne, numTwo, add, subtract, multiply, divide);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readNumOne() {
        System.out.println("What is the first number? ");
        return in.nextLine();
    }

    public String readNumTwo() {
        System.out.println("What is the second number?");
        return in.nextLine();
    }

    public int addition(String numOne, String numTwo) {
        int intOne = Integer.parseInt(numOne);
        int intTwo = Integer.parseInt(numTwo);
        int sum = intOne + intTwo;
        return sum;
    }

    public int subtraction(String numOne, String numTwo) {
        int intOne = Integer.parseInt(numOne);
        int intTwo = Integer.parseInt(numTwo);
        int difference = intOne - intTwo;
        return difference;
    }

    public int multiplication(String numOne, String numTwo) {
        int intOne = Integer.parseInt(numOne);
        int intTwo = Integer.parseInt(numTwo);
        int product = intOne * intTwo;
        return product;
    }

    public int division(String numOne, String numTwo) {
        int intOne = Integer.parseInt(numOne);
        int intTwo = Integer.parseInt(numTwo);
        int quotient = intOne / intTwo;
        return quotient;
    }

    public String generateOutputString(String numOne, String numTwo, int add, int subtract, int multiply, int divide) {
        return numOne + " + " + numTwo + " = " + add +
                "\n" + numOne + " - " + numTwo + " = " + subtract +
                "\n" + numOne + " * " + numTwo + " = " + multiply +
                "\n" + numOne + " / " + numTwo + " = " + divide;
    }
}
