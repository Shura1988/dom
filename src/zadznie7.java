import javax.crypto.Mac;

/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.*/
public class zadznie7 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int rad = 5;
        if (Math.sqrt((a*a)+(b*b))>(rad*2))
            System.out.println(" Не Закроет ");
        else System.out.println(" Закроет");
         ;


    }

}
