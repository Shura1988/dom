package PotokiBlinov339;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ParcovkaRun {
    public static void main(String[] args) {
        ArrayList<Parcovka> parking = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            parking.add(new Parcovka(String.valueOf(i + 1)));
        }
        for (Parcovka i : parking) {
            i.start();
           /* try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }*/

        }

    }
}



