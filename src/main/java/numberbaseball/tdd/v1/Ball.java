package numberbaseball.tdd.v1;

public class Ball {

    private final int number;
    private final int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public BallStatus play(Ball ball) {
        if(ball.isStrike(number, position)){
            return BallStatus.STRIKE;
        }
        else if(ball.isBall(number)){
            return BallStatus.BALL;
        }
        return BallStatus.OUT;
    }

    private boolean isBall(int number) {
        return this.number == number;
    }

    public boolean isStrike(int number, int position){
        if(this.number == number & this.position == position ){
            return true;
        }
        return false;
    }
}
