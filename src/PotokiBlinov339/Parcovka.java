package PotokiBlinov339;
/*Автостоянка. Доступно несколько машиномест. На одном месте может
        находиться только один автомобиль. Если все места заняты, то автомо-
        биль не станет ждать больше определенного времени и уедет на другую
        стоянку.*/


public class Parcovka extends Thread {
    public Thread thread; //имя потока(название авто)
    public String nameTread;
    public static int parcingpoin = 5;
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
                parcingpoin++;
                System.out.println(" Car " + nameTread + "  Left in  parkingpoint ");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
//            parcingpoin++;
//            System.out.println("Car  " + nameTread + "  Exit in parkingpoint");
        }else {
            System.out.println("Car  " + nameTread +" no parking point, car go");

        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, nameTread);
            thread.start();
        }
    }
}
