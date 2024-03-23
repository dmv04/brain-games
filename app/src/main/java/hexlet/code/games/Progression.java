package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            String[] currentProgression = createProgression();
            int hiddenElementPosition = Utils.generateRandomNumber(0, currentProgression.length);
            question[1] = currentProgression[hiddenElementPosition];
            currentProgression[hiddenElementPosition] = "..";
            question[0] = printArray(currentProgression);
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    public static String[] createProgression() {
        String[] progression = new String[Utils.MAX_PROGRESSION_VALUE];
        progression[0] = String.valueOf((int) (Math.random() * Utils.FIRST_ELEMENT_RANGE));
        int progressionStep = (int) (Math.random() * (Utils.MAX_PROGRESSION_VALUE - 1) + 1);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = String.valueOf(Integer.parseInt(progression[i - 1]) + progressionStep);
        }
        return progression;
    }

    public static String printArray(String[] progression) {
        StringBuilder result = new StringBuilder();
        for (String number : progression) {
            result.append(number).append(" ");
        }
        return result.toString();
    }
}
