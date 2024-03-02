package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Welcome to the Brain Games!");
        switch (number) {
            case 1:
                Cli.nameSetter();
                break;
            case 2:
                Even.game();
                break;
            case 3:
                Calc.game();
                break;
            case 4:
                GCD.game();
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong symbol");
        }
    }
}
