/*Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.*/

import java.io.File;

public class Zadznie36 {
    public static void main(String[] args) {
        File directory = new File("D:\\DBelhard");
        if (directory.isDirectory()){
            for (File item : directory.listFiles()){
                if (item.isDirectory()){
                    System.out.println(item.getName() + " \t catalog");
                }else {
                    System.out.println(item.getName() + " \t file");
                }

            }



        }

    }
}
