/*Создать двухмерный квадратный массив, и заполнить его «бабочкой»,*/
public class zadanie17 {
    public static void main(String[] args) {
        int i, j;
        int mass[][] = new int[5][5];
       for (i = 0; i < 5/2+1; i++) {
            for (j = 0; j < 5; j++) {
                if (j < i || (j >= (5 - i))) {
                    mass[i][j] = 0;
                } else {
                    mass[i][j] = 1;
                }
            }
        }
           for (i =5-1; i>5/2; i--) {
               for (j = 0; j <5; j++) {
                   if ( (j<(5-1-i)) || (j > i)) {
                       mass[i][j] = 0;
                   } else {
                       mass[i][j] = 1;
                   }
               }
           }

            for(i=0; i<5; i++) {
                for (j = 0; j < 5; j++)
                    System.out.print(mass[i][j] + " ");
                System.out.println();
            }
}}