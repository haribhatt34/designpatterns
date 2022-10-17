package behavioural.strategy.problem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CricketingShot {

    private String incomingBallType;

    public void playShot() {
        if (incomingBallType == "onPads") {
            // write code for
            // how player should move his body
            // and angle his wrist
            // to play flick shot.
            System.out.println("Play flick shot");
        }
        else if (incomingBallType == "straight") {
            System.out.println("Play straight drive");
        }
        else if (incomingBallType == "offSide") {
            System.out.println("Play cover drive");
        }

        // In future if we want to more types of shots leg glance, hook, pull, cut, sweep.
        // Or maybe want to change the way in which we play a particular shot like hook/pull
        // we have change this
    }
}
