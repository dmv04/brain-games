package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;


public class Progression {

    public static void game() {
        String userName = Utils.greetings();
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.STEPS_TO_WIN; i++) {
            String[] currentProgression = Utils.createProgression();
            int hiddenElementPosition = Utils.generateRandomNumber(0, currentProgression.length);
            String answer = currentProgression[hiddenElementPosition];
            currentProgression[hiddenElementPosition] = "..";
            Utils.qaText(Utils.printArray(currentProgression));
            String userAnswer = scanner.next();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                Utils.setCounter(Utils.getCounter() + 1);
            } else {
                Utils.wrongAnswer(userAnswer, answer, userName);
                break;
            }
        }
        if (Utils.getCounter() == Utils.STEPS_TO_WIN) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
