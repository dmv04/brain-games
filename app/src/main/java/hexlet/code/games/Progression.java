package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int FIRST_ELEMENT_MAX_RANGE = 9;
    private static final int FIRST_ELEMENT_MIN_RANGE = 0;
    private static final int PROGRESSION_STEP_MAX_RANGE = 10;
    private static final int PROGRESSION_STEP_MIN_RANGE = 1;
    private static final int PROGRESSION_LENGTH_MAX_RANGE = 15;
    private static final int PROGRESSION_LENGTH_MIN_RANGE = 5;

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            int progressionLength = Utils.generateRandomNumber(PROGRESSION_LENGTH_MIN_RANGE, PROGRESSION_LENGTH_MAX_RANGE);
            int firstProgressionElement = Utils.generateRandomNumber(FIRST_ELEMENT_MIN_RANGE, FIRST_ELEMENT_MAX_RANGE);
            int progressionStep = Utils.generateRandomNumber(PROGRESSION_STEP_MIN_RANGE, PROGRESSION_STEP_MAX_RANGE);
            String[] currentProgression = makeProgression(firstProgressionElement, progressionStep, progressionLength);
            int hiddenElementPosition = Utils.generateRandomNumber(0, currentProgression.length);
            question[1] = currentProgression[hiddenElementPosition];
            currentProgression[hiddenElementPosition] = "..";
            question[0] = String.join(" ", currentProgression);
        } Engine.runGame(questions, DESCRIPTION);
    }

    public static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
