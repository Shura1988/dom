package technic;

public class Fridge extends HomeAppliences implements Technik {
    private String deistvie;

    public Fridge(String name, Brand brand, int power, boolean on, String naznachenie, String deistvie) {
        super(name, brand, power, on, naznachenie);
        this.deistvie = deistvie;
    }
@Override
    public  String toString() {
        return "Устройство  " + name + "    Брэнд   " + brand + "   Его мощность   " + power + "Вт" + "Вкл/Вкл  " +
                on + "   Предназначен для кухни   " + "Назначение   " + naznachenie + " Действие  " + deistvie;
    }}
