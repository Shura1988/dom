/*Задание 33
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
Задание*/


import java.io.*;
import java.util.Scanner;
import java.lang.String;


public class Met3Zadanie33 {

    public static void main(String[] args){
        try {
            BufferedInputStream txt = new BufferedInputStream(new FileInputStream("new.txt"));
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
            txt.close();
            sc.close();

            FileReader myFile = null;
            BufferedReader buff = null;
            String line = new String();
            try {
                myFile = new FileReader("new.txt");
                buff = new BufferedReader(myFile);
                int count2 = 0;
                while ((line = buff.readLine()) != null) {

                    char[] m = line.toCharArray();
                    for (int i = 0; i < m.length; i++) {
                        if (m[i] == ',' || m[i] == '.' || m[i] == '!' || m[i] == ';') {
                            count2++;
                        }
                    }
                }
                System.out.println("Колличество знаков препинания : " + count2);

            } catch (IOException e) {
                System.out.println(e);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}




