package animal;
/*Создать объект класса Щенок, используя классы Животное, Собака.
        Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
*/

public class Animals {
    private int age;

    public Animals(int age) {
        this.age = age;
        if(age<=0){
            try {
                throw new AgeLogicExeption ("age is incorrect");
            } catch (AgeLogicExeption ageLogicExeption) {
                ageLogicExeption.printStackTrace();
            }
        }
    }
    public void voice(){
        System.out.println("Default voice");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
    }

    public void sting() {
    }

    public void jump() {
    }
}


