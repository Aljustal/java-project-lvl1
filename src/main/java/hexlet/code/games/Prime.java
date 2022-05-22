package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void startGame() {

        String userName = Engine.greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        final int minRandom = 1;
        final int maxRandom = 100;
        final int gameScoreToWin = 3;
        final int[] primeNumbers = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
            43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int correctAnswersCount = 0;

        while (correctAnswersCount < gameScoreToWin) {
            boolean isPrime = false;
            int randomNum = Engine.getRandomNum(minRandom, maxRandom);
            for (var val: primeNumbers) {
                if (val == randomNum) {
                    isPrime = true;
                }
            }

            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            Scanner userAnswerScanner = new Scanner(System.in);
            String userAnswer = userAnswerScanner.nextLine();

            if (userAnswer.equals("yes") && isPrime) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (userAnswer.equals("no") && !isPrime) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else if (userAnswer.equals("yes") && !isPrime) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                break;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                break;
            }

            if (correctAnswersCount == Engine.GAME_SCORE_TOWIN) {
                Engine.conratulationUser(userName);
            }
        }
    }
}
