package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {

        System.out.print("May I have your name? ");
        Scanner name = new Scanner(System.in);
        //String name = s.nextLine();
        System.out.println("Hello, " + name.nextLine() + "!");
    }
}
