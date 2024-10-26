package inter;

import inter._interface.Hand;
import inter._interface.Head;
import inter._interface.Leg;
import inter.sony.SonyHand;
import inter.sony.SonyHead;
import inter.toshiba.ToshibaLeg;

public class RobotConstruction {

    public static void main(String[] args) {
        Head head = new SonyHead();
        Hand hand = new SonyHand();
        Leg leg = new ToshibaLeg();

        Robot robot = new Robot(head, hand, leg);
        robot.action();
    }

}
