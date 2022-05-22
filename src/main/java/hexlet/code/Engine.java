package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MIN_RANDOM = 1;
    public static final int MAX_RANDOM = 100;
    public static final int GAME_SCORE_TOWIN = 3;
    public static String greetingUser() {
        System.out.println();
        System.out.println("Welcome to the Brain Games dude!");

        System.out.print("May I have your name? ");
        Scanner nameScanner = new Scanner(System.in);
        String userName = nameScanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static int correctAnswer(int correctAnswersCount) {
        System.out.println("Correct!");
        return correctAnswersCount++;
    }
    public static void conratulationUser(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static int getRandomNum(int minRandom, int maxRandom) {
        double randomNum = (minRandom + Math.random() * maxRandom - minRandom);
        return (int) randomNum;
    }
    public  static int getRndNum(int from, int to) {
        return from + (int) (Math.random() * to);
    }
}
