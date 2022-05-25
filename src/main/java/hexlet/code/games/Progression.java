package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int MIN_RANDOM_PROGRESSION = 1;
    static final int MAX_RANDOM_PROGRESSION = 5;
    static final int LENGTH_PROGRESSION = 10;
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final String DESCRIPTION = "What number is missing in the progression?";
    public static void startGame() {
        String[][] questionAndAnswer = dataGeneration();
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }

    public static String[][] dataGeneration() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNum = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            int randomProgression = Utils.getRandomNumber(MIN_RANDOM_PROGRESSION, MAX_RANDOM_PROGRESSION);
            int lengthProgression = Utils.getRandomNumber(MAX_RANDOM_PROGRESSION, LENGTH_PROGRESSION);

            int[] progressionQuestion = generateProgression(randomNum, randomProgression, lengthProgression);
            int correctAnswer = Utils.getRandomNumber(0, LENGTH_PROGRESSION);
            questionAndAnswer[i][0] = getAnswerAndQuestions(progressionQuestion, correctAnswer);
            questionAndAnswer[i][1] = String.valueOf(progressionQuestion[correctAnswer]);
        }
        return questionAndAnswer;
    }

    public static int[] generateProgression(int firstElement, int step, int lengthProgressions) {
        if (lengthProgressions > LENGTH_PROGRESSION) {
            lengthProgressions = LENGTH_PROGRESSION;
        }
        int[] progression = new int[lengthProgressions];
        progression[0] = firstElement;

        for (var i = 1; i < lengthProgressions; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    public static String getAnswerAndQuestions(int[] progression, int elementNumber) {
        StringBuilder progressionString = new StringBuilder();
        String numberString;
        for (var i = 0; i < progression.length; i++) {
            numberString = String.valueOf(progression[i]);

            if (i == elementNumber) {
                numberString = "..";
            }
            progressionString.append(numberString).append(" ");
        }
        return progressionString.toString();
    }
}
