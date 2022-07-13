package challenge;

public class Ball {

    private int value;
    private int position;

    public Ball(int value, int position) {
        this.value = value;
        this.position = position;
    }

    public BallStatus makeBallStatus(Ball ball){
        if(ball.strike(value, position)){
            return BallStatus.STRIKE;
        }

        else if(ball.ball(value)){
            return BallStatus.BALL;
        }

        return BallStatus.OUT;
    }

    public boolean strike(int value, int position ){
        return (this.value == value & this.position == position );
    }

    public boolean ball(int value){
        return this.value == value;
    }
}
