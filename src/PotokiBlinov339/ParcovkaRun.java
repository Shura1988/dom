package PotokiBlinov339;

import java.util.ArrayList;


public class ParcovkaRun {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Parcovka("Car " + (i + 1)).start();
            try {
                Thread.sleep((int) Math.random() * 1000); //интервал 1-2 сек
            } catch (InterruptedException e) {
                System.out.println(e); //ошибка
            }

        }

    }
}











     /*   ArrayList<Parcovka> parking = new ArrayList<>();

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




