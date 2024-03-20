package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GreatestCommonDivisor {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int randomNumber1 =
                    Utils.generateRandomNumber(Utils.RANDOM_NUMBER_MIN_RANGE, Utils.RANDOM_NUMBER_MAX_RANGE);
            int randomNumber2 =
                    Utils.generateRandomNumber(Utils.RANDOM_NUMBER_MIN_RANGE, Utils.RANDOM_NUMBER_MAX_RANGE);
            question[0] = randomNumber1 + " " + randomNumber2;
            question[1] = String.valueOf(Utils.findGCD(randomNumber1, randomNumber2));
        }
        Engine.runGame(questions, DESCRIPTION);
    }
}
