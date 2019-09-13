/*Напишите три цикла выполняющих многократное сложение строк, один с
        помощью оператора сложения и String, другой с помощью StringBuilder и метода
        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.*/
import java.lang.*;
public class zadznie21 {
    public static void main(String[] args) {
       String s1= " string ";
       String s2=  " addition ";
       String s3= " test ";
       String s4 = " in java";
       String s5 = s1+s2+s3+s4;
       String s = null;
         for(int i=0; i<1000; i++){
             s+=s5;
          }
           System.out.println(s);
              System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        System.out.println();

       StringBuffer test = new StringBuffer(s5);
        for(int i=0; i<1000; i++){
            s5+=test;}
            System.out.println(test);
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());

        System.out.println();
      StringBuilder test1 = new StringBuilder(s5);
        for(int i=0; i<1000; i++){
            s5+=test1;}
            System.out.println(test1);
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        System.out.println();
        }




}
