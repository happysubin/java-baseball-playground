package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public boolean isNumber(String num){
        List<String> validator = initNumberValidate(num);
        if(validator.contains(num)) return true;
        return false;
    }

    private List<String> initNumberValidate(String num) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(String.valueOf(i));
        }
        return list;
    }

    public boolean isOperator(String op){
        if(op.equals("+") |op.equals("-") |op.equals("*") |op.equals("%") ) return true;
        return false;
    }
}
