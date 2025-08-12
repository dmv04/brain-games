package io.github.dmv04;

import java.util.Scanner;

public class Cli {
    public static void nameSetter() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
