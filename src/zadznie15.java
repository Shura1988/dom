/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/

import java.util.Random;

class zadanie15 {
    public static void main(String[] args) {
        Random namber = new Random();
        int[] mass = new int[namber.nextInt(10)];
        int k;
        System.out.print( "Исходный массив :  ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 100));
            System.out.print(mass[i] + "  ");
                   }
        System.out.println();
        for (int i = 0; i < mass.length/2; i++) {
            k = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = k;
        }
        System.out.print("отсортированный массив: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "  ");
        }
    }
}