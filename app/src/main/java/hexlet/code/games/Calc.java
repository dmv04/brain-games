package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int randomNumber1 = Utils.generateRandomNumber(0, Utils.RANDOM_NUMBER_MAX_RANGE);
            int randomNumber2 = Utils.generateRandomNumber(0, Utils.RANDOM_NUMBER_MAX_RANGE);
            String[] randomData = generateData(randomNumber1, randomNumber2);
            question[0] = randomData[0];
            question[1] = randomData[1];
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    public static String[] generateData(int number1, int number2) {
        int number = Utils.generateRandomNumber(0, 2);
        String question = "";
        String answer = "";
        switch (number) {
            case 0:
                question = number1 + " + " + number2;
                answer = Integer.toString(calculate('+', number1, number2));
                break;
            case 1:
                question = number1 + " - " + number2;
                answer = Integer.toString(calculate('-', number1, number2));
                break;
            case 2:
                question = number1 + " * " + number2;
                answer = Integer.toString(calculate('*', number1, number2));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return new String[]{question, answer};
    }

    public static int calculate(char operator, int number1, int number2) {
        if (operator == '+') {
            return number1 + number2;
        } else if (operator == '-') {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }
}
