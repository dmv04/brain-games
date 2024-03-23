package hexlet.code;

public class Utils {
    public static final int MAX_PROGRESSION_VALUE = 10;
    public static final int FIRST_ELEMENT_RANGE = 10;
    public static final int RANDOM_NUMBER_MIN_RANGE = 0;
    public static final int RANDOM_NUMBER_MAX_RANGE = 100;

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
