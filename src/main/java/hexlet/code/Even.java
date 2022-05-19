package hexlet.code;
import java.util.Scanner;

public class Even {
    public static final int MINRANDOM = 1;
    public static final int MAXRANDOM = 100;
    public static final int GAMESCORETOWIN = 3;
    public static void startGame() {
        System.out.println();
        System.out.println("Welcome to the Brain Games dude!");

        System.out.print("May I have your name? ");
        Scanner nameScanner = new Scanner(System.in);
        String userName = nameScanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        int correctAnswersCount = 0;
        while (correctAnswersCount < GAMESCORETOWIN) {
            int randomNum = getRandomNum(MINRANDOM, MAXRANDOM);
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
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                break;
            }
            if (correctAnswersCount == GAMESCORETOWIN) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
    public static int getRandomNum(int minRandom, int maxRandom) {
        double randomNum = (minRandom + Math.random() * maxRandom - minRandom);
        return (int) randomNum;
    }
}
