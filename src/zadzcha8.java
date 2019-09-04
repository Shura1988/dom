/*Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

import java.util.Random;
public class zadzcha8 {
    public static void main (String[] args) {
        //Random rand = new Random();
       // int num = rand.nextInt(1000);
       int num=31;
        int i = num%10;
        if (num >5 && num <21)
            System.out.println(num + "рублей");
        else  if (i==0)
        System.out.println(num + " рублей");
        else if (i==1)
            System.out.println(num + "рубль");
        else if (i>1 && i<5)
            System.out.println(num + "рубля");
        else if (i>4)
            System.out.println(num + "рублей");


        //ублей");

    }

}
