package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;


public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int number = Utils.generateRandomNumber(Utils.RANDOM_NUMBER_MIN_RANGE, Utils.RANDOM_NUMBER_MAX_RANGE);
            question[0] = Integer.toString(number);
            question[1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(questions, DESCRIPTION);

    }
}
