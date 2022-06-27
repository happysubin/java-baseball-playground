package numberbaseball.tdd.v1;

public class ValidationUtils {

    private static int MIN_NUM = 1;
    private static int MAX_NUM = 9;

    static boolean validateRange(int num){
        return (num >= MIN_NUM & num <= MAX_NUM );
    }

    public static boolean validateDuplicate(int num1, int num2, int num3) {
        return (num1 != num2 & num2 != num3 & num3 != num1);
    }
}
