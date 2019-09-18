package Technic;

public class Kitchen extends Room {
    public String deystvie;

    Kitchen(String name, String brand, int power, boolean Of, String naznachenie, String deystvie) {
        super(name, brand, power, Of, naznachenie);
        deystvie = deystvie;
    }

    @Override
    public void OnOf(boolean On) {
        System.out.println("Устройство  " + getName() + " Брэнд " + getBrand() + " Его мощность " + getPower() + "Включено" +
                On + "Предназначен для комнаты"+ naznachenie + "Действие " + deystvie);
    }
}
