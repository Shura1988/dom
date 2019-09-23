package kreditcard;

import org.w3c.dom.ls.LSOutput;

public class CreditRun {
    public static void main(String[] args) {
        Credi bps = new CreditCard("BPS", 1234, "PLASTIC", true);
        bps.on();
        Credi alfabank = new Zarplata("ALFABANK", 7777, "PLASTIC", true, true );
        alfabank.off();
        System.out.println(bps);
        System.out.println(alfabank);
    }


}
