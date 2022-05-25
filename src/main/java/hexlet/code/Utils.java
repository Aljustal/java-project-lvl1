package hexlet.code;

public class Utils {
    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (minNumber + Math.random() * maxNumber);
    }
}
