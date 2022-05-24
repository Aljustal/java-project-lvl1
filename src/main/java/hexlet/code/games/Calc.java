package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String QUESTION = "What is the result of the expression?";
    static final char SUBTRACTION = '-';
    static final char ADDITION = '+';
    static final char MULTIPLICATION = '*';
    static final int MAX_OPERATIONS_COUNT = 3;
    static final char[] OPERATIONS = {SUBTRACTION, ADDITION, MULTIPLICATION};
    public static void startGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNum1 = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            int randomNum2 = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            int randomNumberOperation = (int) (0 + Math.random() * MAX_OPERATIONS_COUNT - 0);
            char operation = OPERATIONS[randomNumberOperation];

            int correctAnswer = switch (operation) {
                case SUBTRACTION -> randomNum1 - randomNum2;
                case ADDITION -> randomNum1 + randomNum2;
                case MULTIPLICATION -> randomNum1 * randomNum2;
                default -> throw new RuntimeException("Unexpected operation");
            };
            questionAndAnswer[i][0] = String.valueOf(randomNum1) + operation + String.valueOf(randomNum2);
            questionAndAnswer[i][1] = String.valueOf(correctAnswer);
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }
}
