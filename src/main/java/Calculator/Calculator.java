package Calculator;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import static java.lang.Double.parseDouble;

public class Calculator {



    public Calculator(){}

    public void calculate(String input){

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] tokens = input.split(" ");
        for (String token : tokens){
            queue.add(token);
        }

        while(queue.size()>1){
            simplify(queue);
        }

        System.out.println(queue.pop());

    }

    private void simplify(ArrayDeque<String> q){
        double leftDouble = parseDouble(q.pop());
        String mathOperator = q.pop();
        double rightDouble = parseDouble(q.pop());

        q.push(String.valueOf(getResult(leftDouble, mathOperator, rightDouble)));

    }

    private double getResult(double left, String operator, double right){

        double result = 0;

        switch(operator){
            case "+":
                result = left + right;
                break;

            case "-":
                result = left - right;
                break;

            case "*":
                result = left * right;
                break;

            case "/":
                result = left / right;
                break;

        }

        return result;

    }


}
