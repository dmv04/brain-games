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
            question[1] = Utils.isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(questions, DESCRIPTION);
    }
}
