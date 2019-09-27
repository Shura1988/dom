/*Задание 33
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
Задание*/


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Met3Zadanie33 {

    public static void main(String[] args) throws IOException {
        FileReader txt = new FileReader("new.txt");
        int res = txt.read();
        while (res != -1) {
            System.out.print((char) res);
            res = txt.read();
        }
        txt.close();
        System.out.println();

         File text = new File("new.txt");
        Scanner sc = new Scanner(new FileInputStream(text));
        int count = 0;
        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        System.out.println(count);
        sc.close();

        Scanner sc1 = new Scanner(new FileInputStream(text));
        int count2= 0;
        while (sc1.hasNext(("[.,;:()?!\"\\s]+ ")))
        {
            sc.next();
            count2++;
        }
        System.out.println(count2);
        sc1.close();
    }
}



