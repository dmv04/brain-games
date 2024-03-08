package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;
import static hexlet.code.Utils.*;

public class Progression {

    public static void game() {
        String userName = Utils.greetings();
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String[] currentProgression = createProgression();
            int hiddenElementPosition = generateRandomNumber(0, 10);
            String answer = currentProgression[hiddenElementPosition];
            currentProgression[hiddenElementPosition] = "..";
            Utils.qaText(printArray(currentProgression));
            String userAnswer = scanner.next();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                Utils.counter++;
            } else {
                Utils.wrongAnswer(userAnswer, answer, userName);
                break;
            }
        }
        if (Utils.counter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
