package challenge;

public class GameResult {

    private int ballCount;
    private int strikeCount;

    public static final String ANSWER = "Answer";
    public static final String OUT = "Out";
    public static final String STRIKE = "Strike";
    public static final String BALL = "Ball";

    public GameResult() {
        this.ballCount = 0;
        this.strikeCount = 0;
    }

    public void makeResult(BallStatus ballStatus){
        if(ballStatus == BallStatus.STRIKE){
            strikeCount++;
        }
        else if(ballStatus == BallStatus.BALL){
            ballCount++;
        }
    }

    public String getResult() {
        if(strikeCount == 3){
            return  ANSWER;
        }
        else if (strikeCount == 0 & ballCount == 0){
            return OUT;
        }

        return strikeCount + " " + STRIKE + " " + ballCount + " " + BALL;
    }
}
