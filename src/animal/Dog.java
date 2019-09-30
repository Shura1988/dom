package animal;



/*Создать объект класса Щенок, используя классы Животное, Собака.
        Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
*/
public class Dog extends Animals {
    private String name;

    public Dog(int age, String name) {
        super(age);
        this.name = name;
    }

    public void run() {
        System.out.println("Running");
    }

    public void sting() {
        System.out.println("Sting");

    }

    @Override
    public void voice() {
        System.out.println("GAV, GAV");
    }
}
