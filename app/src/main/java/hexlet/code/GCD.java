package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static void game() {
        Cli.nameSetter();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber1 = (int) (Math.random() * 100);
            int randomNumber2 = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(String.valueOf(findGCD(randomNumber1, randomNumber2)))) {
                counter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (findGCD(randomNumber1, randomNumber2)) + "'.");
                break;
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.userName);
        }
    }

    public static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
