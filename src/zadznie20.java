
import java.lang.*;
import java.util.regex.Pattern;

public class zadznie20 {
    public static void main(String[] args) {
        String str = "Программистами не рождаются, програмистами становятся! ";
        String[] slova  = str.split("[\\s[,;.:!]]+");
        String bykvi ="";

        for (int i = 0; i < slova.length; i++) {
            bykvi += slova[i].substring(slova[i].length()-1 );
        }

        System.out.println("Исходная строка: " + str);
        System.out.println("Последние буквы: " +bykvi);
}
}