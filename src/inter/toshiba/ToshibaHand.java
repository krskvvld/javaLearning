package inter.toshiba;

import inter._interface.Hand;

public class ToshibaHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Toshiba Hand");
    }

}
