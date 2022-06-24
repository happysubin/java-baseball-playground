package stringcalculator;

import java.util.Scanner;

public class InputSystem {
    
    private final Validator validator;

    public InputSystem(Validator validator) {
        this.validator = validator;
    }

    public String[] inputMathematicalExpression(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        validation(s);
        return s.split(" ");
    }

    public void validation(String str){
        String[] tmp = str.split(" ");
        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){ //짝수는 무조건 숫자.
                if(!validator.isNumber(tmp[i])) throw new RuntimeException("올바른 숫자를 입력하세요");
            }
            else{ //홀수는 무조건 연산자
                if(!validator.isOperator(tmp[i])) throw new RuntimeException("올바른 연산자를 입력하세요");
            }
            //무조건 식의 길이는 홀수여야한다.
            if(tmp.length % 2 == 0){
                throw new RuntimeException("연산자와 숫자를 올바르게 입력하세요");
            }
        }
    }
}
