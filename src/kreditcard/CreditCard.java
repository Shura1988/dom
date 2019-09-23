package kreditcard;
/*Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.*/

public class CreditCard implements Credi {

    protected String bank;
    protected int namber;
    protected String material;
    protected boolean on;

    CreditCard(String bank, int namber, String material, boolean on) {
        this.bank = bank;
        this.namber = namber;
        this.material = material;
        this.on = on;
    }

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public String toString() {
        return "Карта Банка " + bank + "  Номер карты  " + namber + "  Материал  " + material + "  Вам дали/не дали кредит  " + on;

    }

}
