package test.blinov.too;

public class Run {
    public static void main(String[] args){
        int i = 4;
        for (Shape f : Shape.values()){
            f.setShape(3, i--);
            System.out.println(f + " площадь = " + f.computerSquare());
        }

    }
}
