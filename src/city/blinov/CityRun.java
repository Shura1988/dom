package city.blinov;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class CityRun {
    public static void main(String[] args) {

        System.out.println(" Enter town name  : ");
        City town = new City();
        town.info.TownInfo();

    }
}
