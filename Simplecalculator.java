import java.util.Scanner;

public class Simplecalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter the first number:");
            double num1 = scanner.nextDouble();
            System.out.print("enter the operator:(+,-,/,*):");
            char operator = scanner.next().charAt(0);
            System.out.print("enter the second number:");
            double num2 = scanner.nextDouble();
            double result = 0.0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error:Invalid operator.");

                        return;
                    }
                    System.out.println("Result=" + result);

            }
        }
    }
}
