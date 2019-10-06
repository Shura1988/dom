package PotokiBlinov339;
/*Автостоянка. Доступно несколько машиномест. На одном месте может
        находиться только один автомобиль. Если все места заняты, то автомо-
        биль не станет ждать больше определенного времени и уедет на другую
        стоянку.*/

import java.util.concurrent.Semaphore;

public class Parcovka extends Thread {
    private static final Semaphore parking = new Semaphore(5, true);//парктинг с 5 свободными местами
    private String car;
    long time = (long) (Math.random() * 2000);

    public Parcovka(String car) {
        this.car = car;//название авто
    }

    @Override
    public void run() {
            checkparking();
            try {
                System.out.println(" Car " + car + " Waiting");
                Thread.sleep(time);
                checkparking();
                System.out.println("Car " + car + " is go in free parking ");
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }

        }

    private void checkparking() {
            try {
                parking.acquire();
                System.out.println("  Car  " + car + "   Stand in parcingpoint ");
                Thread.sleep(time*2);
                System.out.println(" Car " + car + "  Exit in  parkingpoint ");
                parking.release();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

    }


    public static Semaphore getParking() {
        return parking;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}















   /* private String nameTread;
    private static int parcingpoin = 3;
    int time = (int) (Math.random() * 1000);

    public Parcovka(String nameTread) {
        this.nameTread = nameTread;
    }

    @Override
    public void run() {
        if (parcingpoin > 0) {
            checkparking();
        } else {
            try {
                System.out.println(" Car " + nameTread + " Waiting");
                Thread.sleep(time);
                System.out.println("Car " + nameTread + " is checking for free parkingpoint ");
                checkparking();
            } catch (InterruptedException ex) {
                System.out.println(ex);

            }

        }
    }

    private void checkparking() {
        if (parcingpoin > 0) {
            try {
                parcingpoin--;
                System.out.println("  Car  " + nameTread + "   Stand in parcingpoint ");
                Thread.sleep(time);
                //parcingpoin++;
                //System.out.println(" Car " + nameTread + "  Left in  parkingpoint ");

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            parcingpoin++;
            System.out.println("Car  " + nameTread + "  Exit in parkingpoint");
        } else {
            System.out.println("Car  " + nameTread + " no parking point, car go");

        }
    }


   /* public String getNameTread() {
        return nameTread;
    }

    public void setNameTread(String nameTread) {
        this.nameTread = nameTread;
    }

    public static int getParcingpoin() {
        return parcingpoin;
    }

    public static void setParcingpoin(int parcingpoin) {
        Parcovka.parcingpoin = parcingpoin;
    }

}
*/
