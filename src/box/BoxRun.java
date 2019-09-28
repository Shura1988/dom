package box;
/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxRun {
    public static void main(String[] args) {
        Box box = new Box();
        String[] animal = new String[]{"Cat", "Dog", "Mause", "Horse"};
        box.box(animal);
        List<String> animals = new ArrayList(Arrays.asList(animal));
        String element =  animals.get(2);

        System.out.println("возвращает  элемент массива по индексу: " + element);

    }
}

