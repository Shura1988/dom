/*Имеется текст. Следует составить для него частотный словарь.*/

import java.util.*;

public class Zadanie32 {
    public static void main(String[] args) {

        String tecst = "ученье свет, а не ученье - тьма";
        String[] stroka = tecst.split(" ");
        String j;
        System.out.print("Исходная строка : " + tecst);
       /* for (int i = 0; i < stroka.length; i++) {
           j = stroka[i];
            System.out.print(j + " ");*/
       // }

       // System.out.println();
        HashMap<String, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < stroka.length; i++) {
            count = 0;
            for (int k = 0; k < stroka.length; k++) {
                if (stroka[i].equals(stroka[k])) {
                    count++;
                }
            }
            map.put(stroka[i], count);
        }
        System.out.println(map);
    }
}

