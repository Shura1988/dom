package metodichka3.zadanie29;
/*Задание 29
//        Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Удалить неудовлетворительные оценки из списка.

Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
*/

import java.util.*;

public class StudentRun {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] mass = new Integer[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10);
            //System.out.print( mass[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> points = new ArrayList<>(Arrays.asList(mass));
        System.out.print("Получаем исходнуюю коллекцию : " + points);
        System.out.println();

        ArrayList<Integer> points2 = new ArrayList<>();
        for (int i = 0; i < points.size(); i++)
            if (points.get(i) > 3) {
                points2.add(points.get(i));
            }
        System.out.print("Удаляем неудовлетворительные оценки(что меньше 3-х) : " + points2);
        System.out.println();
        Set<Integer> point3 = new HashSet<>(points);
        points.clear();
        points.addAll(point3);
        System.out.println("Удаляем повторяющиеся числа : " + point3);
    }
}






/* List Class = new List();
        String[] student = new String[]{"Vasya", "Frosya", "Yliya", "Petya"};
        Random rand = new Random();
        int num = rand.nextInt(10);
        Integer[] points = new Integer[]{num, num, num, num, num};
        Class.print(student);
        Class.print(points);*/

