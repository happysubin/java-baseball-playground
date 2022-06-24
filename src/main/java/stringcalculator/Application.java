package stringcalculator;

public class Application {
    public static void main(String[] args) {
        Validator validator = new Validator();
        InputSystem inputSystem = new InputSystem(validator);
        OperatorProcess operator = new OperatorProcess();
        StringCalculator stringCalculator = new StringCalculator(operator);

        String[] arr = inputSystem.inputMathematicalExpression();
        int result = stringCalculator.calculate(arr);

        System.out.println(result);
    }
}
