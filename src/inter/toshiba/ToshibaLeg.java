package inter.toshiba;

import inter._interface.Leg;

public class ToshibaLeg implements Leg {

    @Override
    public void go() {
        System.out.println("Toshiba leg catch something");
    }

}