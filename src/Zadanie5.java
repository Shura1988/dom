/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        различны?*/

import java.util.Objects;
import java.util.Scanner;
public class Zadanie5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a four digit number : ");
        int num = in.nextInt();
        int num1 = num / 1000;
        int num2 = num/100 % 10;
        int num3 = num/10%10;
        int num4 =num%10;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
        System.out.println(Objects.equals(num1, num2));
        System.out.println(Objects.equals(num2, num3));
        System.out.println(Objects.equals(num3, num4));


        in.close();

    }
}
