package animal;
/*Создать объект класса Щенок, используя классы Животное, Собака.
        Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
*/
public class Puppy extends Dog {
    private String color;

    public Puppy(int age, String name, String color) {
        super(age, name);
        this.color = color;
            }
            public void jump(){
                System.out.println("Jumping");
            }
            @Override
    public void voice(){
                System.out.println("Tyaf, tyaf");
            }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
