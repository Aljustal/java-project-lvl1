package hexlet.code.games;
import hexlet.code.Engine;
public class Progression {
    static final int MIN_RANDOM_PROGRESSION = 1;
    static final int MAX_RANDOM_PROGRESSION = 5;
    static final int LENGTH_PROGRESSION = 10;
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String QUESTION = "What number is missing in the progression?";
    public static void startGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int randomNum = Engine.getRandomNum(MIN_RANDOM, MAX_RANDOM);
            int randomProgression = Engine.getRndNum(MIN_RANDOM_PROGRESSION, MAX_RANDOM_PROGRESSION);
            int correctAnswer = Engine.getRndNum(0, LENGTH_PROGRESSION);
            String question = "";
            for (var j = 0; j < LENGTH_PROGRESSION; j++) {
                if (correctAnswer == j) {
                    question += " .. ";
                    correctAnswer = randomNum;
                    randomNum += randomProgression;
                } else {
                    question += " " + randomNum + " ";
                    randomNum += randomProgression;
                }
            }
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = String.valueOf(correctAnswer);
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }
}
