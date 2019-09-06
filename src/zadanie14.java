/*Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.*/

import java.util.Random;

public class zadanie14 {
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

    }
}