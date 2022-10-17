package behavioural.strategy.solution;

public class Main {
    public static void main(String[] args) {

        CricketingShot shot = new CricketingShot(new FlickStrategy());
        shot.play();
    }
}
