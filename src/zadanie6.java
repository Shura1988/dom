/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/

import java.util.Random;
//import java.io.*;
public class zadanie6 {
    public static void main(String[] args) {
        // int num;
        Random rand = new Random();
        int num = rand.nextInt(10000);
        System.out.println(num);
        String b = String.valueOf(num);
        if (b.length() == 3)
            System.out.println(" Число " + b + " трехзначное ");
        else
            System.out.println("Число " + b + "  имеет  " + b.length() + " символов ");
         if (num % 10 == 7)
               System.out.println(" последняя цифра числа "+num +" '7' ");
         else System.out.println(" последняя цифра числа "+num + " не '7' ");
        if (num % 2 == 0)
            System.out.println(" Число " +num+ " четное ");
        else
            System.out.println("Число " + num + " не четное ");
    }
}
