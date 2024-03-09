package hexlet.code;

import hexlet.code.games.Calc;

import hexlet.code.games.Even;

import hexlet.code.games.GreatestCommonDivisor;

import hexlet.code.games.Prime;

import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int CLI = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Welcome to the Brain Games!");
        switch (number) {
            case CLI:
                Cli.nameSetter();
                break;
            case EVEN:
                Even.game();
                break;
            case CALC:
                Calc.game();
                break;
            case GCD:
                GreatestCommonDivisor.game();
                break;
            case PROGRESSION:
                Progression.game();
                break;
            case PRIME:
                Prime.game();
                break;
            case EXIT:
                break;
            default:
                System.out.println("Wrong symbol");
        }
    }
}
