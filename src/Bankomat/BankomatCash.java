package Bankomat;


import java.util.Scanner;

public class BankomatCash {
    public final static void main(String[] args) {
        Bankomat ATM1 = new Bankomat(100, 50, 20);
        ATM1.Allcash();
        Scanner sc = new Scanner(System.in);
        int i = -1;
        System.out.println("Операция добавлени - 1, Операция снятия - 2,  Выход - 3");
        while (i != 1 || i != 2 || i!=3) {
            System.out.println("Введите ноер операции");
            i = sc.nextInt();
            if (i == 1) {
                System.out.println("Укажите сумму ктору хотите зачислить");
                int cash = sc.nextInt();
                ATM1.addmaney(cash);
            } else if (i == 2) {
                System.out.println("Введите желаемую сумму(имеющиеся наминалы 20, 50 или 100): ");
                int cash = sc.nextInt();
                System.out.println( ATM1.Outmaney(cash));
            } else  if (i==3) {
                Bankomat.Exit();
            }else {
                System.out.println(" Вы выбрали что-то непонятное");
            }return;

        } sc.close();
    }
}


