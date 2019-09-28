/*Задание 33
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
Задание*/


import java.io.*;
import java.util.Scanner;

public class Met3Zadanie33 {

    public static void main(String[] args) throws IOException {

        BufferedInputStream txt = new BufferedInputStream(new FileInputStream ("new.txt"));
        try {
            System.out.println(" Исходный текст: ");
            int res = txt.read();
            while (res != -1) {
                System.out.print((char) res);
                res = txt.read();
            }
            System.out.println();

            File text = new File("new.txt");
            Scanner sc = new Scanner(new FileInputStream(text));
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("Колличество слов в тексте: " + count);

            int count2 = 0;
            while (sc.hasNext("[.,!;:?]+")) {
                sc.next(" ");
                count2++;
            }
                System.out.println("Колличество знаков препинания: " + count2);

               // System.out.println("нет знаков препинания");


            sc.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        txt.close();

    }
}



