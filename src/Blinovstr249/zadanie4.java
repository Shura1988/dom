package Blinovstr249;

/*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/
public class zadanie4 {
    public static  void main(String[] args){
        int n = 4567;
        String strings = "4567";
        StringBuffer str = new StringBuffer(strings);

        System.out.println("\nИсходное значение: " + str);
       str.reverse();
        System.out.println("Значение  в обратном порядке: " + str);
    }

}
