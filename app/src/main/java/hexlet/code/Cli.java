package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String userName;

    public static void nameSetter() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
