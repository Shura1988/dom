/*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.*/

package Bankomat;

public class Bankomat {

    private static int kolnam20;//колличество купюр наминалом 20
    private static int kolnam50;//колличество купюр наминалом 50
    private static int kolnam100;//колличество купюр наминалом 100
    private static int nam20 = 20;//наминалы кюпир
    private static int nam50 = 50;//наминалы кюпир
    private static int nam100 = 100;//наминалы кюпир
    private static int cash; //деньги
    private static int Allcash;//общкк колличество денег
    private static int addmaney;
    private static int Outmaney;

    Bankomat(int kolnam20, int kolnam50, int kolnam100) {
            this.kolnam20=kolnam20;
            this.kolnam50=kolnam50;
            this.kolnam100=kolnam100;
            Allcash = kolnam20*nam20 + kolnam50*nam50+ kolnam100*nam100;
        }
    public static void Allcash()
    {
        System.out.println("Всего енег в банкомате  " + Allcash);
    }

    public void addmaney(int kolnam20, int kolnam50, int kolnam100)
    {
        cash = kolnam20*nam20 + kolnam50*nam50+ kolnam100*nam100;
        Allcash +=cash;
      System.out.println("Стало денег в банкомате  после зачисления  " + Allcash);
   }
        public static boolean Outmaney(int cash) {
        Allcash -=cash;
            if (cash % 10 != 00 ||  cash<20) {
                System.out.println("Некорректная сумма");
                return false;
            } else {
                if (Allcash >= cash) {
                    System.out.println("Возьмите деньги;" + " Сумма остатка в кассе : " + Allcash);
                    return true;
                } else {

                    System.out.println("Недостаточно средств");
                    return  false;
                }
            }
        }

        /*int naminal;
            naminal = nam100 % 100;
            nam100 = (cash - naminal) / 100;
            nam50 = (nam100 - (nam100 % 50)) / 50;
            nam20 = (nam50 - (nam50 % 20)) / 20;
            this.kolnam100 -= nam100;
            this.kolnam50 -= nam50;
            this.kolnam20 -= nam20;
            System.out.println();;*/




           /* int cash = 0;
            if (cash<20) {
                System.out.println(" некорректная сумма");}
            else if (cash == 20) {
                kolnam20 --;}
            else if (cash ==50) {
                kolnam50--;}
                else if (cash==100){
                    kolnam100--;
                System.out.println(" В банкомате осталось : " + this.AllmaneyA + "купюр");




            } else return false;
        }*/

    public static int getKolnam20() {
        return kolnam20;
    }

    public static void setKolnam20(int kolnam20) {
        Bankomat.kolnam20 = kolnam20;
    }

    public static int getKolnam50() {
        return kolnam50;
    }

    public static void setKolnam50(int kolnam50) {
        Bankomat.kolnam50 = kolnam50;
    }

    public static int getKolnam100() {
        return kolnam100;
    }

    public static void setKolnam100(int kolnam100) {
        Bankomat.kolnam100 = kolnam100;
    }

    public static int getNam20() {
        return nam20;
    }

    public static void setNam20(int nam20) {
        Bankomat.nam20 = nam20;
    }

    public static int getNam50() {
        return nam50;
    }

    public static void setNam50(int nam50) {
        Bankomat.nam50 = nam50;
    }

    public static int getNam100() {
        return nam100;
    }

    public static void setNam100(int nam100) {
        Bankomat.nam100 = nam100;
    }

    public static int getCash() {
        return cash;
    }

    public static void setCash(int cash) {
        Bankomat.cash = cash;
    }

    public static int getAllcash() {
        return Allcash;
    }

    public static void setAllcash(int allcash) {
        Allcash = allcash;
    }

    public static int getAddmaney() {
        return addmaney;
    }

    public static void setAddmaney(int addmaney) {
        Bankomat.addmaney = addmaney;
    }

    public static int getOutmaney() {
        return Outmaney;
    }

    public static void setOutmaney(int outmaney) {
        Outmaney = outmaney;
    }
}




