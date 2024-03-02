package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void game() {
        Cli.nameSetter();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int randomNumber1 = (int) (Math.random() * 100);
        int randomNumber2 = (int) (Math.random() * 100);
        System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        if (answer.equals(String.valueOf(randomNumber1 * randomNumber2))) {
            counter++;
            System.out.println("Correct!");
            int randomNumber3 = (int) (Math.random() * 100);
            int randomNumber4 = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber3 + " + " + randomNumber4);
            System.out.print("Your answer: ");
            answer = scanner.next();
            if (answer.equals(String.valueOf(randomNumber3 + randomNumber4))) {
                counter++;
                System.out.println("Correct!");
                int randomNumber5 = (int) (Math.random() * 100);
                int randomNumber6 = (int) (Math.random() * 100);
                System.out.println("Question: " + randomNumber5 + " - " + randomNumber6);
                System.out.print("Your answer: ");
                answer = scanner.next();
                if (answer.equals(String.valueOf(randomNumber5 - randomNumber6))) {
                    counter++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber5 - randomNumber6) + "'.");
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber3 + randomNumber4) + "'.");
            }
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber1 * randomNumber2) + "'.");
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.userName);
        }
    }
}
