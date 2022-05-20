package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MINRANDOM = 1;
    public static final int MAXRANDOM = 100;
    public static final int GAMESCORETOWIN = 3;
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
}
