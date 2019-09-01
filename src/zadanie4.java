/*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/
public class zadanie4 {
    public static  void main(String[] args){
        int n = 4567;
        String str = Integer.toString(n);
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nИсходное значение: " + str);
        System.out.println("Значение  в обратном порядке: " + reverse);

    }

}
