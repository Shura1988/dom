/*Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.*/

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class met3zadanie34 {
    public static void main(String[] args) throws IOException {

        try {
            String s = "";
            Scanner sc = new Scanner(new File("chisla.txt"));
            while ((sc.hasNext())) {
                s += sc.nextLine() + "\r\n";
            }
            System.out.println("Исхоный текст : ");
            System.out.println(s);
            sc.close();
            String[] number = s.split(" ");

            s = s.replaceAll("[^0-9]+", " ");
            List<String> list = new ArrayList<>(Arrays.asList(s.trim().split(" ")));
            ArrayList<Integer> numberList = new ArrayList<>();
            for (String numbers : list) {
                numberList.add(Integer.parseInt(numbers));
            }
            System.out.println("Числа из текста: " + numberList);
            int sum = 0;
            for (int i = 0; i < numberList.size(); i++) {
                sum += numberList.get(i);
            }
            System.out.println("Сумма чискл: " + sum);
            Set<Integer> set = new HashSet<>(numberList);
            numberList.clear();
            numberList.addAll(set);
            System.out.println("Удаляем повторяющиеся числа : " + set);


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}













