
/*надо получить ряд случайных чисел, и рассчитать произведение, т.е. факториал числа.Ввод чисел прекращается,
если очередным числом будет ноль.
 */

public class zadanie9 {
    public static void main (String[] args) {
        long fact = 1;
        long x = (int)(Math.random() * 20);
        System.out.println("число:" + x);
            for (int i = 1; i <= x; i++)
                fact *= i;
        if(x != 0){
            System.out.println("factorial chisla x:" + fact);
        } else {
            x = 0;

        System.out.println("Вввод чисел прекращается");
            }


        }}



