/*Найдите сумму первых n целых чисел, которые делятся на 3.*/
import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a four digit number : ");
        int n = in.nextInt();
        int k = 0;
        int sum = 0;
        for (int i = 0; k <= n; i++) {
            if (i % 3 == 0){
                k++;
                sum += i;
            }

        }
         System.out.println("Сумма чисел кратных трем: " + sum);

        in.close();


    }
}
