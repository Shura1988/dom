package technic;

class HomeAppliences implements Technik {
    protected String name;
    protected Brand brand;
    protected int power;
    protected boolean on;
    protected String naznachenie;

    public HomeAppliences(String name, Brand brand, int power, boolean on, String naznachenie) {
        this.name = name;
        this.brand = brand;
        this.power = power;
        this.on = on;
        this.naznachenie = naznachenie;
    }


    public void On() {
        on = true;
    }

    public void Off() {

        on = false;
    }
    @Override
    public String toString() {
        return "Устройство  " + name + "    Брэнд   " + brand + "   Его мощность   " + power + "Вт  " + "Вкл/Вкл  " +
                on + "   Предназначен для комнаты   " + "Назначение   " + naznachenie;
    }
}













