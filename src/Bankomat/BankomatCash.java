package Bankomat;


import java.util.Scanner;
public class BankomatCash {
    public static void main(String[] args) {
        Bankomat ATM1 = new Bankomat(100, 50, 20);
        ATM1.Allcash();
        ATM1.addmaney(3, 5, 2);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите желаемую сумму(имеющиеся наминалы 20, 50 или 100): ");
        int cash = in.nextInt();
         ATM1.Outmaney(cash);

         in.close();
    }
}
