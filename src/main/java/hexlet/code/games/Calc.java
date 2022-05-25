package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String DESCRIPTION = "What is the result of the expression?";
    static final char[] OPERATIONS = {'-', '+', '*'};
    public static void startGame() {
        String[][] questionAndAnswer = dataGeneration();
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
    public static String[][] dataGeneration() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNum1 = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            int randomNum2 = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            int randomNumberOperation = (int) (0 + Math.random() * OPERATIONS.length - 0);
            char operation = OPERATIONS[randomNumberOperation];

            int correctAnswer = switch (operation) {
                case '-' -> randomNum1 - randomNum2;
                case '+' -> randomNum1 + randomNum2;
                case '*' -> randomNum1 * randomNum2;
                default -> throw new RuntimeException("Operation for which logic is not defined");
            };
            questionAndAnswer[i][0] = String.valueOf(randomNum1) + " " + operation + " " + String.valueOf(randomNum2);
            questionAndAnswer[i][1] = String.valueOf(correctAnswer);
        }
        return questionAndAnswer;
    }
}
