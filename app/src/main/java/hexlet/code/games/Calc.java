package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;
import static hexlet.code.Utils.generateData;

public class Calc {
    public static void game() {
        String userName = Utils.greetings();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int randomNumber1 = Utils.generateRandomNumber(0, 100);
            int randomNumber2 = Utils.generateRandomNumber(0, 100);
            String[] randomData = generateData(randomNumber1, randomNumber2);
            Utils.qaText(randomData[0]);
            String answer = scanner.next();
            if (answer.equals(String.valueOf(randomData[1]))) {
                Utils.counter++;
                System.out.println("Correct!");
            } else {
                Utils.wrongAnswer(answer, randomData[1], userName);
            }
        }
        if (Utils.counter == 3) {
            System.out.println("Congratulations, " + userName);
        }
    }

}
