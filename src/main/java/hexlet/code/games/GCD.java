package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static void startGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNum1 = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            int randomNum2 = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            questionAndAnswer[i][0] = String.valueOf(randomNum1) + " " + String.valueOf(randomNum2);
            questionAndAnswer[i][1] = String.valueOf(gcd(randomNum1, randomNum2));
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
