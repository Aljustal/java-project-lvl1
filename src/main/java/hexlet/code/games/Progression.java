package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void startGame() {
        String userName = Engine.greetingUser();

        System.out.println("What number is missing in the progression?");
        final int minRandomProgression = 1;
        final int maxRandomProgression = 5;
        final int lengthProgression = 10;

        int correctAnswersCount = 0;
        while (correctAnswersCount < Engine.GAME_SCORE_TOWIN) {
            int randomNum = Engine.getRandomNum(Engine.MIN_RANDOM, Engine.MAX_RANDOM);
            int randomProgression = Engine.getRndNum(minRandomProgression, maxRandomProgression);
            int correctAnswer = Engine.getRndNum(0, lengthProgression);
            System.out.print("Question:");
            for (var i = 0; i < lengthProgression; i++) {
                if (correctAnswer == i) {
                    System.out.print(" .. ");
                    correctAnswer = randomNum;
                    randomNum += randomProgression;
                } else {
                    System.out.print(" " + randomNum + " ");
                    randomNum += randomProgression;
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            Scanner userAnswerScanner = new Scanner(System.in);
            int userAnswer = userAnswerScanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                String message = " is wrong answer ;(. Correct answer was ";
                System.out.println("'" + userAnswer + "'" + message + correctAnswer + ".");
                break;
            }

            if (correctAnswersCount == Engine.GAME_SCORE_TOWIN) {
                Engine.conratulationUser(userName);
            }
        }
    }
}
