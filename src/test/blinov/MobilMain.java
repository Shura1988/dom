package test.blinov;

public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent((Long) 819002l, "Timofey Balashiv");
abonent.setTariffPlan("free");
abonent.obtainPhoneNumber(375, 29);
        System.out.println(abonent);
    }
}
