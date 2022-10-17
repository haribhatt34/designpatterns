package behavioural.strategy.solution;

public class StraightDriveStrategy implements CricketShotStrategy {
    @Override
    public void playShot() {
        System.out.println("Play straight drive");
    }
}
