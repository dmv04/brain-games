package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;
import static hexlet.code.Utils.findGCD;
import static hexlet.code.Utils.generateRandomNumber;

public class GCD {
    public static void game() {
        String userName = Utils.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int randomNumber1 = generateRandomNumber(0, 100);
            int randomNumber2 = generateRandomNumber(0, 100);
            Utils.qaText(randomNumber1 + " " + randomNumber2);
            String answer = scanner.next();
            if (answer.equals(String.valueOf(findGCD(randomNumber1, randomNumber2)))) {
                Utils.counter++;
                System.out.println("Correct!");
            } else {
                Utils.wrongAnswer(answer, findGCD(randomNumber1, randomNumber2), userName);
                break;
            }
        }
        if (Utils.counter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
