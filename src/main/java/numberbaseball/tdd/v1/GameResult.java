package numberbaseball.tdd.v1;

public class GameResult {
    int ballCount = 0;
    int strikeCount = 0;

    public void makeResult(BallStatus status){
        if(status == BallStatus.BALL){
            ballCount++;
        }
        else if(status == BallStatus.STRIKE){
            strikeCount++;
        }
    }
}
