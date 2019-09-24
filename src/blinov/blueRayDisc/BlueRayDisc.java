package blinov.blueRayDisc;
/*Создать класс BlueRayDisc с внутренним классом, с помощью объектов
которого можно хранить информацию о каталогах, подкаталогах
и записях.*/


import java.util.Scanner;

public class BlueRayDisc {
    public String discName;
    public Info info;
    Scanner in = new Scanner(System.in);

    BlueRayDisc() {
        this.discName = in.next();
        info = new Info();
    }

    public void setBlueRayDisc(String discName) {
        this.discName = discName;
    }

    public class Info {
        private int catalog;
        private int subdirectory;
        private int records;


        Info() {
            System.out.println(" Enter quantity catalog ");
            this.catalog = in.nextInt();
            System.out.println(" Enter quantity subdirectory ");
            this.subdirectory = in.nextInt();
            System.out.println(" Enter quantity records ");
            this.records = in.nextInt();

        }

        public void DiscInfo() {
            System.out.println("In BlueRay Diske " + discName + " catalog " + getCatalog() + " subdirectory " + getSubdirectory() +
                    " records " + getRecords());
        }


        public int getCatalog() {
            return catalog;
        }

        public void setCatalog(int catalog) {
            this.catalog = catalog;
        }

        public int getSubdirectory() {
            return subdirectory;
        }

        public void setSubdirectory(int subdirectory) {
            this.subdirectory = subdirectory;
        }

        public int getRecords() {
            return records;
        }

        public void setRecords(int records) {
            this.records = records;
        }

    }
}
