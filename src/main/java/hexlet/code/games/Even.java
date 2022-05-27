package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void startGame() {
        String[][] questionAndAnswer = dataGeneration();
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
    public static String[][] dataGeneration() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNumber = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            questionAndAnswer[i][0] = String.valueOf(randomNumber);
            questionAndAnswer[i][1] = isEvenNumber(randomNumber) ? "yes" : "no";
        }
        return questionAndAnswer;
    }
    public static boolean isEvenNumber(int number) {
        return  (number % 2 == 0);
    }
}

