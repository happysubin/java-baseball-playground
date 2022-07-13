package challenge;

import javax.lang.model.SourceVersion;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String INVALIDATION_INPUT_MESSAGE = "3자리 숫자를 입력해주세요. ex 039";
    private static final String INPUT_BALLS = "숫자를 입력해 주세요 : ";

    public static String getBalls(){
        System.out.println(INPUT_BALLS);
        String numbers = scanner.next();
        validate(numbers);
        return numbers;
    }

    public static boolean validate(String numbers) {
        Pattern pattern = Pattern.compile("[0-9][0-9][0-9]");
        Matcher matcher = pattern.matcher(numbers);
        if(!matcher.matches()){
            throw new IllegalArgumentException(INVALIDATION_INPUT_MESSAGE);
        }
        return true;
    }
}
