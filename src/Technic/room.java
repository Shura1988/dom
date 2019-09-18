package Technic;
abstract class Room extends Technik{
    public String naznachenie;

    Room(String name, String brand, int power, boolean Of, String naznachenie) {
        super(name, brand, power, Of);
        naznachenie = naznachenie;
    }

    @Override
    public void OnOf(boolean On) {
        System.out.println("Устройство  " + getName() + " Брэнд " + getBrand() + " Его мощность " + getPower() + "Включено" +
                On + "Предназначен для комнаты"+ naznachenie);
    }
}













