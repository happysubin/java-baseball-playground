package numberbaseball.v1;

import java.util.ArrayList;

public class Player {

    public ArrayList<Integer> createAttemptedAnswer(){
        InputSystem inputSystem = new InputSystem();
        ArrayList<Integer> attemptedAnswer = new ArrayList<>(3);

        inputSystem.receiveAnswer(attemptedAnswer);
        return attemptedAnswer;
    }


    public int choiceGamerReStartOrStop(){
        InputSystem inputSystem = new InputSystem();

        int choice = inputSystem.receiveChoice();
        return choice;
    }
}
