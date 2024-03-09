package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

public class Calc {
    public static void game() {
        String userName = Utils.greetings();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Utils.stepsToWin; i++) {
            Scanner scanner = new Scanner(System.in);
            int randomNumber1 = Utils.generateRandomNumber(0, Utils.randomNumberMaxRange);
            int randomNumber2 = Utils.generateRandomNumber(0, Utils.randomNumberMaxRange);
            String[] randomData = Utils.generateData(randomNumber1, randomNumber2);
            Utils.qaText(randomData[0]);
            String answer = scanner.next();
            if (answer.equals(String.valueOf(randomData[1]))) {
                Utils.setCounter(Utils.getCounter() + 1);
                System.out.println("Correct!");
            } else {
                Utils.wrongAnswer(answer, randomData[1], userName);
                break;
            }
        }
        if (Utils.getCounter() == Utils.stepsToWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
