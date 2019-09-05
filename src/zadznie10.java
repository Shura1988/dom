
/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

public class zadznie10 {
    public static void main (String[] args){
        int a = 10;
        int b = 5;
        int num = a + (int) (Math.random() * b);
        System.out.println(" Cлучайное число: " + num);
        long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("factorial chisla x:" + fact);




    }
}
