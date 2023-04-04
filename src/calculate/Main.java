package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter one of the symbol +, - , *, / : ");
        char symbol = sc.next().charAt(0);


        Calculator obj = new Calculator();
        obj.calculateResult(firstNumber, secondNumber, symbol);
        System.out.println(obj.calculateResult(firstNumber, secondNumber, symbol));

        boolean result = true;
        while (result) {
            System.out.println("Would you like to do more calculations? Please enter y or n : ");
            char ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Enter first number : ");
                firstNumber = sc.nextInt();
                System.out.println("Enter second number : ");
                secondNumber = sc.nextInt();
                System.out.println("Please enter one of the symbol +, - , *, / : ");
                symbol = sc.next().charAt(0);
                System.out.println(obj.calculateResult(firstNumber, secondNumber, symbol));
            } else if (ch == 'N' || ch == 'n') {
                break;
            }
        }
    }
}
