package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;


public class Progression {

    public static void game() {
        String userName = Utils.greetings();
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.stepsToWin; i++) {
            String[] currentProgression = Utils.createProgression();
            int hiddenElementPosition = Utils.generateRandomNumber(0, Utils.randomNumberMaxRange);
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
        if (Utils.getCounter() == Utils.stepsToWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
