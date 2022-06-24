package stringcalculator;

import java.util.Scanner;

public class InputSystem {
    public String[] inputMathematicalExpression(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s.split(" ");
    }
}
