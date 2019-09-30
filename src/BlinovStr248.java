
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import java.util.Scanner;
/*В следующих заданиях требуется ввести последовательность строк из текс-
*тового потока и выполнить указанные действия. При этом могут рассматри-
*ваться два варианта:
*• каждая строка состоит из одного слова;
*• каждая строка состоит из нескольких слов.
*Имена входного и выходного файлов, а также абсолютный путь к ним могут
*быть введены как параметры командной строки или храниться в файле.
*1. В каждой строке найти и удалить заданную подстроку.
*/
public class BlinovStr248 {
    public static void main(String[] args) {
        try {
            System.out.println("Веедите 3 строки: " );
            /** Строки которые я ввожу:
              *  Hello Java.
              *  Hello world Java.
              *  Hello. Java Best of The Best.
            */
            Scanner sc = new Scanner(System.in);
            String s1,s2,s3,s4;
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();
            s4 = s1+s2+s3;
            System.out.println("Исходный текси: " + s4);
            sc.close();
            FileOutputStream fos = new FileOutputStream("D://DBelhard//dom//textFile.txt");
            PrintStream printStream = new PrintStream(fos);
            printStream.println(s4);
            System.out.println("Файл записан");
            fos.close();
            String replace = s4.replace("Java", " ");
            FileOutputStream fos1 = new FileOutputStream(("D://DBelhard//dom//textFile1.txt"));
            PrintStream printStream1 = new PrintStream(fos1);
            printStream1.println(replace);
            System.out.println("Файл перезаписан");
            System.out.println("Итоговый текст : " + replace);
            fos1.close();
        } catch (IOException e) {
            System.out.println( e );
        }

    }
}
