/*Найдите сумму первых n целых чисел, которые делятся на 3.*/
import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a four digit number : ");
        int n = in.nextInt();
        int summ = 0;
        int k = 1;
        for (int i = 1; k <= n; i++) {
            if (i % 3 == 0) {
                summ += i;
                System.out.print( summ + "  " );
                k++;
            }
        }
        in.close();


    }
}
