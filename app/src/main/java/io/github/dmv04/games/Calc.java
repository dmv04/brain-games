package io.github.dmv04.games;

import io.github.dmv04.Engine;
import io.github.dmv04.Utils;


public class Calc {
    private static final int RANDOM_NUMBER_MIN_RANGE = 1;
    private static final int RANDOM_NUMBER_MAX_RANGE = 20;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void game() {
        int indexOperator = Utils.generateRandomNumber(0, OPERATORS.length - 1);
        char operator = OPERATORS[indexOperator];
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int number1 = Utils.generateRandomNumber(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
            int number2 = Utils.generateRandomNumber(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
            question[0] = number1 + " " + operator + " " + number2;
            question[1] = Integer.toString(calculate(operator, number1, number2));
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    public static int calculate(char operator, int number1, int number2) {
        if (operator == '+') {
            return number1 + number2;
        } else if (operator == '-') {
            return number1 - number2;
        } else if (operator == '*') {
            return number1 * number2;
        } else {
            throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
