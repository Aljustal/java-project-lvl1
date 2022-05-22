package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void startGame() {
        String userName = Engine.greetingUser();

        System.out.println("Find the greatest common divisor of given numbers.");

        final int minRandom = 1;
        final int maxRandom = 100;
        final int gameScoreTowin = 3;
        int correctAnswersCount = 0;
        while (correctAnswersCount < gameScoreTowin) {
            int randomNum1 = Engine.getRandomNum(minRandom, maxRandom);
            int randomNum2 = Engine.getRandomNum(minRandom, maxRandom);

            System.out.println("Question: " + randomNum1 + " " + randomNum2);
            System.out.print("Your answer: ");
            Scanner userAnswerScanner = new Scanner(System.in);
            int userAnswer = userAnswerScanner.nextInt();
            int correctAnswer = gcd(randomNum1, randomNum2);

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                String message = " is wrong answer ;(. Correct answer was ";
                System.out.println("'" + userAnswer + "'" + message + correctAnswer + ".");
                break;
            }
            if (correctAnswersCount == gameScoreTowin) {
                Engine.conratulationUser(userName);
            }
        }
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
