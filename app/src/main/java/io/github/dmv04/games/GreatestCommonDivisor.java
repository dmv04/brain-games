package io.github.dmv04.games;

import io.github.dmv04.Engine;
import io.github.dmv04.Utils;

public class GreatestCommonDivisor {
    private static final int RANDOM_NUMBER_MIN_RANGE = 1;
    private static final int RANDOM_NUMBER_MAX_RANGE = 20;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int randomNumber1 =
                    Utils.generateRandomNumber(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
            int randomNumber2 =
                    Utils.generateRandomNumber(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
            question[0] = randomNumber1 + " " + randomNumber2;
            question[1] = String.valueOf(gcd(randomNumber1, randomNumber2));
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
