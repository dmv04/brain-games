package hexlet.code;

import java.util.Scanner;

public class Progression {

    public static void game() {
        Cli.nameSetter();
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        var counter = 0;
        for (int i = 0; i < 3; i++) {
            String[] currentProgression = createProgression();
            var hiddenElementPosition = (int) (Math.random() * 10);
            var answer = currentProgression[hiddenElementPosition];
            currentProgression[hiddenElementPosition] = "..";
            System.out.println("Question: " + printArray(currentProgression));
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                break;
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.userName);
        }
    }

    public static String[] createProgression() {
        String[] progression = new String[10];
        progression[0] = String.valueOf((int) (Math.random() * 10));
        int progressionStep = (int) (Math.random() * 9 + 1);
        for (int i = 1; i < 10; i++) {
            progression[i] = String.valueOf(Integer.parseInt(progression[i - 1]) + progressionStep);
        }
        return progression;
    }

    public static String printArray(String[] progression) {
        StringBuilder result = new StringBuilder();
        for (String number : progression) {
            result.append(number).append(" ");
        }
        return result.toString();
    }
}
