/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
        текста также могут быть пробелы, но могут и отсутствовать.*/


public class met2zadanie19 {
    public static void main(String[] args) {

        int i;
        String str = "String method in Java with examples. ";
        System.out.println(str);
        String [] mass = str.split("[a-zA-Z]+");
        for( i = 0; i<mass.length-1; i++) {

        }
            System.out.println("Колличество слов в строке  " + i);
    }
} //Альтернативный вариант
/*StringTokenizer st = new StringTokenizer(str, " ,!.;");

        List<String> wordsList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            wordsList.add(st.nextToken());
        }
        wordsList.forEach(System.out::println);*/