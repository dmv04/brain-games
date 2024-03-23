package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int randomNumber =
                    Utils.generateRandomNumber(Utils.RANDOM_NUMBER_MIN_RANGE + 1, Utils.RANDOM_NUMBER_MAX_RANGE);
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
