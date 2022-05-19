package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Even.startGame();
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner choice = new Scanner(System.in);

        int userChoice = choice.nextInt();

        switch (userChoice) {
            case 1: Cli.greeting();
                break;
            case 2: Even.startGame();
                break;
            default:

        }

    }
}
