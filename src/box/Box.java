package box;
/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.*/


import java.util.ArrayList;
import java.util.List;

public class Box {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("mause");
        animals.add("horse");
        System.out.println("Выводим масив : " + animals);
        System.out.println("возвращает  элемент массива по индексу: " + animals.get(3));

    }
}

