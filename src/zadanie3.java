/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
//по аналогии с примером выше.*/

public class zadanie3 {
    public static  void main(String[] args){
        int v=4500;
        int sec=v%60;
        int m=(v-sec)/60;
        int min = m%60;
        System.out.println( m + " минут " + sec + " секунд" );
        int h=(m-min)/60;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд" );
        int d = h%24;
        int den = (h-d)/24;
        System.out.println(den + " дней " + h + " часов " + min + " минут " + sec + " секунд" );
        int ned =den/7;
        System.out.println(ned  + " недель " + den + " дней " + h + " часов " + min + " минут " + sec + " секунд" );


    }
}
