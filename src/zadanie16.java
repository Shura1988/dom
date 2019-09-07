
/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.*/

import java.util.Random;
public class zadanie16 {
public static void main(String[] args) {
Random namber = new Random();
        int [] mass = new int[namber.nextInt(8)+2];
        for (int i = 0; i < mass.length; i++) {
        mass[i] = ((int) (Math.random() * 10));
        System.out.print(mass[i] + "  ");
        }
        System.out.println();
        int min = mass[0];
        int max = mass[0];
        int indexMin=0;
        int indexMax=0;
        for(int i=1; i <mass.length; i++){
        if(mass[i] < min)
        {
        min = mass[i];
        indexMin = i;
        }
        if(mass[i] > max)
        {
        max = mass[i];
        indexMax = i;
        }
        }
        System.out.println("min и max: " + min + " " + max);
        System.out.println("indexMin и indexMax : " + indexMin + " " + indexMax);
        int summ = 0;
        if (indexMin < indexMax) {
                for (int i = indexMin  + 1; i < indexMax; i++)
                    summ += mass[i];
            } else if (indexMin > indexMax) {
                for (int i = indexMax + 1; i < indexMin; i++)
                    summ += mass[i];
            }

            System.out.println("Сумма" + summ);

        }
}