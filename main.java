package capgemini.calculator2;

public class main {

    // Function to add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Function to subtract two numbers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        // Testing add function
        int additionResult = add(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + additionResult);

        // Testing subtract function
        int subtractionResult = subtract(number1, number2);
        System.out.println("The difference between " + number1 + " and " + number2 + " is: " + subtractionResult);
    }
}

