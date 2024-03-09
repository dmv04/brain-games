package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;


public class GreatestCommonDivisor {
    public static void game() {
        String userName = Utils.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.STEPS_TO_WIN; i++) {
            int randomNumber1 = Utils.generateRandomNumber(0, Utils.RANDOM_NUMBER_MAX_RANGE);
            int randomNumber2 = Utils.generateRandomNumber(0, Utils.RANDOM_NUMBER_MAX_RANGE);
            Utils.qaText(randomNumber1 + " " + randomNumber2);
            String answer = scanner.next();
            if (answer.equals(String.valueOf(Utils.findGCD(randomNumber1, randomNumber2)))) {
                Utils.setCounter(Utils.getCounter() + 1);
                System.out.println("Correct!");
            } else {
                Utils.wrongAnswer(answer, Utils.findGCD(randomNumber1, randomNumber2), userName);
                break;
            }
        }
        if (Utils.getCounter() == Utils.STEPS_TO_WIN) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
