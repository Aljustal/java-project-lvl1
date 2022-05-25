package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void startGame() {

        String[][] questionAndAnswer = dataGeneration();
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
    public static String[][] dataGeneration() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNum1 = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            int randomNum2 = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            questionAndAnswer[i][0] = String.valueOf(randomNum1) + " " + String.valueOf(randomNum2);
            questionAndAnswer[i][1] = String.valueOf(gcd(randomNum1, randomNum2));
        }
        return questionAndAnswer;
    }
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
