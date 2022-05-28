package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {
        String[][] questionAndAnswer = dataGeneration();
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
    public static String[][] dataGeneration() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int randomNum = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            questionAndAnswer[i][0] = String.valueOf(randomNum);
            questionAndAnswer[i][1] = isPrimeNumber(randomNum) ? "yes" : "no";
        }
        return questionAndAnswer;
    }
    public static boolean isPrimeNumber(int num) {
        boolean isPrime = true;
        for (var i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

}
