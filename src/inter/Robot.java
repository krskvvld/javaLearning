package inter;

import inter._interface.Hand;
import inter._interface.Head;
import inter._interface.Leg;

public class Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
