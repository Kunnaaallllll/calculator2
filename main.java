package capgemini.calculator2;

public class main {

    // Function to add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Main method to test the add function
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        int result = add(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}