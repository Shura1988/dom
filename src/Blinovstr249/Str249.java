package Blinovstr249;
/*Прочитать текст Java-программы и записать в другой файл в обратном по-
рядке символы каждой строки.*/

import java.io.*;

public class Str249 {
    public static void main(String[] args) {
        try {
            File f = new File("D:/DBelhard/dom/src/Blinovstr249/zadanie4.java");
            f.createNewFile();
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("revers.java");
            BufferedWriter bw = new BufferedWriter(fw);
            String s;
            while ((s = br.readLine()) != null) {
                for (int i = s.length() - 1; i >= 0; i--)
                    bw.write(s.charAt(i));
                bw.write("\r\n");
            }
            fr.close();
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода" + e);
        }
        try (FileReader fileReader = new FileReader("revers.java")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);

            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода" + e);
        }

    }
}












