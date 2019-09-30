import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
*/

public class Zadanie35 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("file35.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 20; i++) {
                writer.write((int) (Math.random() * 10) + " ");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        FileReader digitList = new FileReader("file35.txt");
        Scanner sc = new Scanner(digitList);
        String s = "";
        while ((sc.hasNext())) {
            s = sc.nextLine();
        }
        System.out.println("Исхоный текст : ");
        System.out.println(s);
        sc.close();

        List<String> list = new ArrayList<>(Arrays.asList(s.trim().split(" ")));
        ArrayList<Integer> numberList = new ArrayList<>();
        for (String numbers : list) {
            numberList.add(Integer.parseInt(numbers));
        }
        double sum = 0;
        double sred = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
            sred = sum / numberList.size();
        }

        System.out.println("Среднее арифметическое: " + sred);
    }
}
