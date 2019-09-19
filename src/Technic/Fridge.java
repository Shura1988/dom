package Technic;

public class Fridge extends HomeAppliences implements Technik {
    private String deistvie;

    public Fridge(String name, String brand, int power, boolean on, String naznachenie, String deistvie) {
        super(name, brand, power, on, naznachenie);
        this.deistvie = deistvie;
    }
    public void On(){
       // System.out.println("Устройство  " + name+ " Брэнд " + brand + " Его мощность " + power + "Включено" +
       //         On + "Предназначен для комнаты"+ naznachenie + "Xranenie " + deistvie);
    }
    public  void  Off(){
      //  System.out.println("Устройство  " + name + " Брэнд " + brand + " Его мощность " + power + "ВЫключено" +
     //           On + "Предназначен для комнаты"+ naznachenie + " Prigotovlenie" + deistvie);
    }

    public  String toString() {
        return "Устройство  " + name + "    Брэнд   " + brand + "   Его мощность   " + power + "Вт" + "Вкл/Вкл  " +
                On + "   Предназначен для кухни   " + "Назначение   " + naznachenie + " Действие  " + deistvie;
    }}
