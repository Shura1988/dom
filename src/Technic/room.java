package Technic;
abstract class HomeAppliences implements Technik{
    protected String name;
    protected String brand;
    protected int  power;
    protected boolean On;
    protected String naznachenie;

    public HomeAppliences(String name, String brand, int power, boolean on, String naznachenie) {
        this.name = name;
        this.brand = brand;
        this.power = power;
        On = on;
        this.naznachenie = naznachenie;
    }


   @Override
    public void On(){
      //  System.out.println("Устройство  " + name + " Брэнд " + brand + " Его мощность " + power + "Включено" +
        //        On + "Предназначен для комнаты"+ naznachenie);
    }
    public  void  Off(){
      //  System.out.println("Устройство  " + name + " Брэнд " + brand + " Его мощность " + power + "ВЫключено" +
      //          On + "Предназначен для комнаты"+ naznachenie);
    }
public  String toString(){
    return "Устройство  " + name + "    Брэнд   " + brand + "   Его мощность   " + power + "Вт  " + "Вкл/Вкл  " +
            On + "   Предназначен для кухни   "+  "Назначение   " + naznachenie;
}
}













