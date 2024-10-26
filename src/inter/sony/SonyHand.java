package inter.sony;

import inter._interface.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Sony Hand");
    }

}
