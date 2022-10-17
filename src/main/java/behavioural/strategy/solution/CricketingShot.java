package behavioural.strategy.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CricketingShot {

    private CricketShotStrategy strategy;

    public void play() {
        strategy.playShot();
    }
}
