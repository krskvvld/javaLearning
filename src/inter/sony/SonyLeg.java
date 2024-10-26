package inter.sony;

import inter._interface.Leg;

public class SonyLeg implements Leg {

    @Override
    public void go() {
        System.out.println("Sony leg catch something");
    }

}