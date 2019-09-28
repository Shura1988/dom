package box;

public class Box {

    public <T> void box(T[] mass){
        for( T animals: mass){
            System.out.println(animals);
        }
    }
}





    /*private S number;
    private T name;

    public Box(S number, T name) {
        this.number = number;
        this.name = name;
    }

    public Box<T, S> getElement(){
return getElement();
    }

    public S getNumber() {
        return number;
    }

    public void setNumber(S number) {
        this.number = number;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}*/
