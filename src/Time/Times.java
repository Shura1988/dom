/*Задание 24
*        Создать класс и объекты описывающие промежуток времени. Сам промежуток
 *       в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 *       Сделать методы для получения полного количества секунд в объекте, сравнения
 *       двух объектов (метод должен работать аналогично compareTo в строках). Создать
 *       два конструктора: получающий общее количество секунд, и часы, минуты и секунды
 *       по отдельности. Сделать метод для вывода данных.
*/

package Time;

import java.util.Objects;

public class Times {
    private  int hour;
    private  int min;
    private  int sek;

    Times(int h, int m, int s){
        this.hour=h;
        this.min=m;
        this.sek=s;
    }
     Times(int Alltimesek){
        this.sek=Alltimesek;
    }
    public String TimeShow()
    {
        return "Time(" +"HH:MI:SS  :  " + hour +":"+ min +":"+ sek +")";
    }
       public int Alltimesek(){
        return  sek ;
    }

       int AlltimesekShow() {
         return ((hour * 3600) + (min * 60) + sek);
     }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Times)) return false;
        Times times = (Times) o;
        return times.AlltimesekShow()==AlltimesekShow();

        /*hour== times.AlltimesekShow() &&
                min == times.AlltimesekShow() &&
                sek==times.AlltimesekShow();*/

    }

   public int getHour() {
       return hour;
}

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSek() {
        return sek;
    }

    public void setSek(int sek) {
        this.sek = sek;
    }
}


