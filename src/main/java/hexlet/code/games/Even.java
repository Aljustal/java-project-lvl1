package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void startGame() {
        String userName = Engine.greetingUser();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        final int MIN_RANDOM = 1;
        final int MAX_RANDOM = 100;
        final int GAME_SCORE_TOWIN = 3;
        int correctAnswersCount = 0;
        while (correctAnswersCount < GAME_SCORE_TOWIN) {
            int randomNum = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            Scanner userAnswerScanner = new Scanner(System.in);
            String userAnswer = userAnswerScanner.nextLine();

            if (randomNum % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (randomNum % 2 != 0 && userAnswer.equals("yes")) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                break;
            } else if (randomNum % 2 != 0 && userAnswer.equals("no")) {
                Engine.correctAnswer(correctAnswersCount);
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                break;
            }
            if (correctAnswersCount == GAME_SCORE_TOWIN) {
                Engine.conratulationUser(userName);
            }
        }
    }
}
