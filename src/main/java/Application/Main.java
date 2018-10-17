package Application;

import Calculator.Calculator;

class Main{

    public static void main (String[] args){

        Calculator calculator = new Calculator();

        String input = "1 + 2 + 3";
        String input2 = "1 - 2 + 3 - 4";

        calculator.calculate(input);
        calculator.calculate(input2);

    }

}
