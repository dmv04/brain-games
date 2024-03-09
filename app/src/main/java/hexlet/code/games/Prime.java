package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;


public class Prime {
    public static void game() {
        String userName = Utils.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < Utils.stepsToWin; i++) {
            int randomNumber = Utils.generateRandomNumber(0, Utils.randomNumberMaxRange);
            Utils.qaText(randomNumber);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if ((Utils.isPrime(randomNumber) && answer.equals("yes")) ||
                    (!Utils.isPrime(randomNumber) && answer.equals("no"))) {
                Utils.setCounter(Utils.getCounter() + 1);
                System.out.println("Correct!");
            } else if (Utils.isPrime(randomNumber) && answer.equals("no")) {
                Utils.wrongAnswer(answer, "yes", userName);
                break;
            } else if (!Utils.isPrime(randomNumber) && answer.equals("yes")) {
                Utils.wrongAnswer(answer, "no", userName);
                break;
            } else {
                System.out.println("Wrong symbol");
                break;
            }
        }
        if (Utils.getCounter() == Utils.stepsToWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
