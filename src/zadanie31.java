
/*Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
Задание*/

import java.util.*;

public class zadanie31 {
    public static void main(String[] args) {
        int max;
        Integer[] mass = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20);
        }
        ArrayList<Integer> points = new ArrayList<>(Arrays.asList(mass));
        System.out.print("Получаем исходнуюю коллекцию : " + points);
        System.out.println();
        Integer i = Collections.max(points);
        System.out.println("MAX число коллекци : " + i);


    }
}

