/*Задание 24
        *        Создать класс и объекты описывающие промежуток времени. Сам промежуток
        *       в классе должен задаваться тремя свойствами: секундами, минутами, часами.
        *       Сделать методы для получения полного количества секунд в объекте, сравнения
        *       двух объектов (метод должен работать аналогично compareTo в строках). Создать
        *       два конструктора: получающий общее количество секунд, и часы, минуты и секунды
        *       по отдельности. Сделать метод для вывода данных.
        */

package Time;

public class TimeRun {
    public static void main(String[] args) {
        Times time1 = new Times(1, 10, 12);
        Times time2 = new Times(3212);
        System.out.println(time1.TimeShow());
        System.out.println(time2.AlltimesekShow());
        System.out.println(time1.equals(time2));
    }
}


