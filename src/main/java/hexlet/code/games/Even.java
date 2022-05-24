package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String QUESTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void startGame() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNumber = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            questionAndAnswer[i][0] = String.valueOf(randomNumber);
            questionAndAnswer[i][1] = ((randomNumber % 2) == 0) ? "yes" : "no";
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }
}

