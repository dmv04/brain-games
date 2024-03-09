package hexlet.code;

import java.util.Scanner;

public class Utils {
    private static int counter = 0;
    public static final int STEPS_TO_WIN = 3;
    public static final int MAX_PROGRESSION_VALUE = 10;
    public static final int FIRST_ELEMENT_RANGE = 10;
    public static final int RANDOM_NUMBER_MAX_RANGE = 100;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter1) {
        Utils.counter = counter1;
    }

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
        String[] progression = new String[MAX_PROGRESSION_VALUE];
        progression[0] = String.valueOf((int) (Math.random() * FIRST_ELEMENT_RANGE));
        int progressionStep = (int) (Math.random() * (MAX_PROGRESSION_VALUE - 1) + 1);
        for (int i = 1; i < progression.length; i++) {
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
            default:
                throw new IllegalStateException("Unexpected value: " + number);
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
