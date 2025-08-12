package io.github.dmv04.games;

import io.github.dmv04.Engine;
import io.github.dmv04.Utils;

public class Prime {
    private static final int RANDOM_NUMBER_MIN_RANGE = 1;
    private static final int RANDOM_NUMBER_MAX_RANGE = 20;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int randomNumber =
                    Utils.generateRandomNumber(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
            question[0] = Integer.valueOf(randomNumber).toString();
            question[1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
