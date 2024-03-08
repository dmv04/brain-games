package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static int counter = 0;

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * max + min);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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

    public static String[] generateData(int number1, int number2) {
        int number = Utils.generateRandomNumber(0, 2);
        String question = "";
        String answer = "";
        switch (number) {
            case 0:
                question = number1 + " + " + number2;
                answer = Integer.toString(calculate('+', number1, number2));
                break;
            case 1:
                question = number1 + " - " + number2;
                answer = Integer.toString(calculate('-', number1, number2));
                break;
            case 2:
                question = number1 + " * " + number2;
                answer = Integer.toString(calculate('*', number1, number2));
                break;
        }
        return new String[]{question, answer};
    }

    public static int calculate(char operator, int number1, int number2) {
        if (operator == '+') {
            return number1 + number2;
        } else if (operator == '-') {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }

    public static String greetings() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void qaText(Object obj) {
        System.out.println("Question: " + obj);
        System.out.print("Your answer: ");
    }

    public static void wrongAnswer(Object wrongAnswer, Object correctAnswer, String userName) {
        System.out.println(wrongAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
        System.out.println("Let's try again, " + userName + "!");
    }

}
