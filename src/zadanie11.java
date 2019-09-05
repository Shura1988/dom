/*Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.*/
import java.util.Scanner;
public class zadanie11 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a four digit number : ");
        int num = in.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num%Math.sqrt(num)==0 || num%2==0){
                System.out.println("Число : " + num + "  Составное");
                break;}

                 else{
                     System.out.println("Число : " + num + "  Простое");
                 break;
        }}
            in.close();


    }
}

