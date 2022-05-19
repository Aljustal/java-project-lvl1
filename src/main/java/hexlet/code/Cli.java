package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println();
        System.out.println("Welcome to the Brain Games dude!");
        System.out.print("May I have your name? ");
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
