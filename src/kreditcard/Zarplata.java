package kreditcard;

public class Zarplata extends CreditCard implements Credi {
    protected Boolean zp;

    Zarplata(String bank, int namber, String material, boolean on, boolean zp) {
        super(bank, namber, material, on);
        this.zp = zp;
    }

    @Override
    public void on() {
        zp = true;
    }

    @Override
    public void off() {
        zp = false;
    }

    public String toString() {
        return "Карта Банка " + bank + " Номер карты   " + namber + "  Материал  " +  material  + "   Вам дали/не дали кредит  " + on +
                "  Пришли деньги  " + zp;
    }
}