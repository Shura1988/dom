
/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

public class zadznie10 {
    public static void main (String[] args){
        long fact = 1;
        int i;
            for (i = 10; i <= 15; i++) {
                fact *= i;
            }
            System.out.println("factorial chisla x:" + fact);




    }
}
