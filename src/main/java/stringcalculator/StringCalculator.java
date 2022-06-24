package stringcalculator;


import java.util.*;

public class StringCalculator {

    private final OperatorProcess operator;

    public StringCalculator(OperatorProcess operator) {
        this.operator = operator;
    }

    public int calculate(String[] arr){
        int result = calculateResult(arr);
        return result;
    }

    private int calculateResult(String[] arr) {
        int result = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i += 2){
            String op = arr[i];
            int num = Integer.parseInt(arr[i + 1]);
            result = operate(op, result, num);
        }
        return result;
    }

    public int operate(String op, int a, int b ){
        if(op.equals("+")){
            return operator.add(a , b);
        }
        else if(op.equals("-")){
            return operator.subtract(a , b);
        }
        else if(op.equals("*")){
            return operator.multiply(a , b);
        }
        else{
            return operator.divide(a , b);
        }
    }
}


/**
 * 연산자 배열과 숫자 배열을 만드려고 했는데, 이게 오히려 복잡도를 증가시킨다는 선생님의 말을 보았다. 그냥 for문으로도 충분할듯?
 */