package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;
public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    public static void game() {
        String[][] questions = new String[Engine.STEPS_TO_WIN][2];
        for (String[] question : questions) {
            String[] currentProgression = Utils.createProgression();
            int hiddenElementPosition = Utils.generateRandomNumber(0, currentProgression.length);
            question[1] = currentProgression[hiddenElementPosition];
            currentProgression[hiddenElementPosition] = "..";
            question[0] = Utils.printArray(currentProgression);
        }
        Engine.runGame(questions, DESCRIPTION);

    }

}
