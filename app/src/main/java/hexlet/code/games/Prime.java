package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;

public class Prime {
    public static void game() {
        String userName = Utils.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = Utils.generateRandomNumber(0, 100);
            Utils.qaText(randomNumber);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if ((Utils.isPrime(randomNumber) && answer.equals("yes")) || (!Utils.isPrime(randomNumber) && answer.equals("no"))) {
                Utils.counter++;
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
        if (Utils.counter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
