package numberbaseball.v1;

public class Application {
    public static void main(String[] args) {
        BaseballGame game = new BaseballGame(new Player(), new Computer());
        game.start();
    }
}
