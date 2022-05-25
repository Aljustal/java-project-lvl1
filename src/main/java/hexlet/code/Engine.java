package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void runGame(String question, String[][] answerAndQuestion) {
        System.out.println("Welcome to the Brain Games dude!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(question);
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + answerAndQuestion[i][0]);

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(answerAndQuestion[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + answerAndQuestion[i][1] + "'. \n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
