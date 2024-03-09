package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;


public class Even {
    public static void game() {
        String userName = Utils.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.stepsToWin; i++) {
            int randomNumber = Utils.generateRandomNumber(0, Utils.randomNumberMaxRange);
            Utils.qaText(randomNumber);
            String answer = scanner.next();
            if ((answer.equals("yes") && randomNumber % 2 == 0) || (answer.equals("no") && randomNumber % 2 == 1)) {
                Utils.setCounter(Utils.getCounter() + 1);
                System.out.println("Correct!");
            } else if (answer.equals("yes") && randomNumber % 2 == 1) {
                Utils.wrongAnswer("yes", "no", userName);
                break;
            } else if (answer.equals("no") && randomNumber % 2 == 0) {
                Utils.wrongAnswer("no", "yes", userName);
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
