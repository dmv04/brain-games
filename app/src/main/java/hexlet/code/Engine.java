package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int STEPS_TO_WIN = 3;

    public static void runGame(String[][] questions, String description) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (String[] question : questions) {
            System.out.println("Question: " + question[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(question[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + question[1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
