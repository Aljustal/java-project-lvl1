package hexlet.code.games;

import hexlet.code.Engine;
public class Prime {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int[] PRIME_NUMBERS = {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
        43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    public static void startGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            boolean isPrime = false;
            int randomNum = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            for (var val: PRIME_NUMBERS) {
                if (val == randomNum) {
                    isPrime = true;
                }
            }
            questionAndAnswer[i][0] = String.valueOf(randomNum);
            questionAndAnswer[i][1] = isPrime ? "yes" : "no";
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }
}
