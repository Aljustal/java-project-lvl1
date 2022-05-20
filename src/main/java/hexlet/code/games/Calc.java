package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void startGame() {
        String userName = Engine.greetingUser();

        System.out.println("What is the result of the expression?");
        final char subtraction = '-';
        final char addition = '+';
        final char multiplication = '*';
        final int maxOperationsCount = 3;
        final char[] operations = {subtraction, addition, multiplication};

        int correctAnswersCount = 0;
        while (correctAnswersCount < Engine.GAMESCORETOWIN) {
            int randomNum1 = Engine.getRandomNum(Engine.MINRANDOM, Engine.MAXRANDOM);
            int randomNum2 = Engine.getRandomNum(Engine.MINRANDOM, Engine.MAXRANDOM);
            int randomNumberOperation = (int) (0 + Math.random() * maxOperationsCount - 0);
            char operation = operations[randomNumberOperation];

            int correctAnswer = switch (operation) {
                case subtraction -> randomNum1 - randomNum2;
                case addition -> randomNum1 + randomNum2;
                case multiplication -> randomNum1 * randomNum2;
                default -> 0;
            };
            System.out.println("Question: " + randomNum1 + operation + randomNum2);
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

            if (correctAnswersCount == Engine.GAMESCORETOWIN) {
                Engine.conratulationUser(userName);
            }
        }
    }
}
