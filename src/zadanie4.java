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

} ///или так
/*StringBuffer str = new StringBuffer(n);
        String str = Integer.toString(n);
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nИсходное значение: " + str);
        System.out.println("Значение  в обратном порядке: " + reverse);*/
