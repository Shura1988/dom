package city.blinov;
/*Создать класс City с внутренним классом, с помощью объектов которого
можно хранить информацию о проспектах, улицах, площадях.*/

import java.util.Scanner;

public class City {
    public String city;
    public final Info info;
    Scanner town = new Scanner(System.in);

    City() {
        this.city = town.next();
        info = new Info();

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public class Info {
        private int avenue;
        private int street;
        private int area;

        Info() {
            System.out.println(" Колличество проспектов : ");
            this.avenue = town.nextInt();
            System.out.println(" Колличество улиц : ");
            this.street = Integer.parseInt(town.next());
            System.out.println(" Колличество площадей : ");
            this.area = Integer.parseInt(town.next());

        }

        public void TownInfo() {
            System.out.println("В городе  " + getCity() + " проспектов " + getavenue() + " улиц " + getstreet() + " площадей " + getarea());
        }


        public int getavenue() {
            return avenue;
        }

        public void setavenue(int avenue) {
            this.avenue = avenue;
        }

        public int getstreet() {
            return street;
        }

        public void setstreet(int street) {
            this.street = street;
        }

        public int getarea() {
            return area;
        }

        public void setarea(int area) {
            this.area = area;
        }
    }
}

