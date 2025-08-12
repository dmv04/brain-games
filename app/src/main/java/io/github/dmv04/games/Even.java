package io.github.dmv04.games;

import io.github.dmv04.Engine;
import io.github.dmv04.Utils;


public class Even {
    private static final int RANDOM_NUMBER_MIN_RANGE = 1;
    private static final int RANDOM_NUMBER_MAX_RANGE = 20;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int number = Utils.generateRandomNumber(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
            question[0] = Integer.toString(number);
            question[1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(questions, DESCRIPTION);

    }
}
