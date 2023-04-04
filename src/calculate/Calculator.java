package calculate;

public class Calculator {

    public void addition(int a, int b){

        System.out.println("Addition of " + a + " and " + b + " is " + (a+b));
    }

    public void subtraction(int a, int b){

        System.out.println("Subtraction of " + a + " and " + b + " is " + (a-b));
    }

    public void multiplication(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a*b));
    }

    public void division(int a, int b){
        System.out.println("Division of " + a + " and " + b + " is " + (a/b));
    }

    public String calculateResult(int a, int  b,char symbol){
       // boolean result = true;
        if(symbol == '+') {
            return ("Addition of "+ a + " and " + b + " is " + (a + b));
        } else if (symbol == '-') {
            return ("Subtraction of " + a + " and " + b + " is " + (a - b));
        } else if (symbol == '*') {
            return ("Multiplication of " + a + " and " + b + " is " + (a * b));
        } else if (symbol == '/') {
            return ("Division of " + a + " and " + b + " is " + (a / b));
        }
            return calculateResult(a, b, symbol);
        }

    }



