package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void game() {
        Cli.nameSetter();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if ((answer.equals("yes") && randomNumber % 2 == 0) || (answer.equals("no") && randomNumber % 2 == 1)) {
                counter++;
                System.out.println("Correct!");
            } else if (answer.equals("yes") && randomNumber % 2 == 1) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.userName);
                break;
            }
            else if (answer.equals("no") && randomNumber % 2 == 0) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.userName);
                break;
            }
            else {
                System.out.println("Wrong symbol");
                break;
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.userName);
        }
    }
}
