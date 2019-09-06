/*Создать последовательность случайных чисел, найти и вывести наибольшее
из них.*/
import java.util.Random;
public class zadanie13 {
    public static void main(String[] args) {
        Random namber = new Random();
        int [] mass = new int[namber.nextInt(100)];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 100));
            System.out.print(mass[i] + "  ");
        }
        System.out.println();
        int min, max;
            min = max = mass[0];
            for(int i=0; i <mass.length; i++){
                if(mass[i] < min)
                    min = mass[i];
                if(mass[i] > max)
                     max = mass[i];
        }
        System.out.println("min и max: " + min + " " + max);

    }
}
