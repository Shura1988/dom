/*22. Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
Задание 23
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.
19


*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadanie2223 {
    public static void main(String[] args) {
        String str = "String  0x98ff method <Я понял, что>, in 0x5fff Java with </*Ты имел ввиду> examples 0x123f. ";
        System.out.println("Исходная строка : " + str);
        System.out.println();
        System.out.println(" С заменой рег. выражений: " + str.replaceAll(("\\<(/?[^\\>]+)\\>"), "<все ОК>"));
        System.out.println();
        Pattern reg = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher m = reg.matcher(str);
        int count = 0;
        while (m.find()) {
            count++;
            System.out.print("шестнадцатеричное число  " + count + ": ");
            System.out.println(m.group());

            }

    }

}
