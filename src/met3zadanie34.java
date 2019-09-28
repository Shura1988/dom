/*Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.*/
import java.io.*;
import java.util.*;

public class met3zadanie34 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File txt = new File("chisla.txt");
            Scanner scanner = new Scanner(txt);
            String line = scanner.nextLine();
            String[] number = line.split(" ");
            int[] mass = new int[number.length];
            int i=0;
            int summ = 0;
            for (String numbers : number) {
                mass[i++] = Integer.parseInt(numbers);
                summ +=Integer.parseInt(numbers);
            }
            System.out.println(" Массив значений" + Arrays.toString(mass));
            System.out.println("Сумма всех значений " + summ);
            System.out.println();

            ArrayList points = new ArrayList(Arrays.asList(number));
            Set<Integer> point = new HashSet(points);
            points.clear();
            points.addAll(point);
            System.out.println("Удаляем повторяющиеся числа  и выводим новый массив: " + point);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
    }
}



