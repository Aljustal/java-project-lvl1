package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner choice = new Scanner(System.in);

        String userChoice = choice.nextLine();

        switch (userChoice) {
            case "1": Cli.greeting();
                break;
            case "2": Even.startGame();
                break;
            case "3": Calc.startGame();
                break;
            default: System.out.println("You entered the wrong number");
        }
    }
}
