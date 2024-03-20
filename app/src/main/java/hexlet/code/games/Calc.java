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
            String[] randomData = Utils.generateData(randomNumber1, randomNumber2);
            question[0] = randomData[0];
            question[1] = randomData[1];
        }
        Engine.runGame(questions, DESCRIPTION);
    }
}
