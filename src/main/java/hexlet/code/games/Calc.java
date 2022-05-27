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
            var correctAnswer = calculate(randomNum1, randomNum2, operation);
            questionAndAnswer[i][0] = String.valueOf(randomNum1) + " " + operation + " " + String.valueOf(randomNum2);
            questionAndAnswer[i][1] = String.valueOf(correctAnswer);
        }
        return questionAndAnswer;
    }
    public static String calculate(int num1, int num2, char operation) {
        int correctAnswer = switch (operation) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            case '*' -> num1 * num2;
            default -> throw new RuntimeException("Operation " + "'" + operation + "'" + " defined");
        };
        return String.valueOf(correctAnswer);
    }
}
