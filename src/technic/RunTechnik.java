package technic;


public class RunTechnik {

    public static void main(String[] args) {
        Technik Televizor = new HomeAppliences("TV", "LG", 1000, false, "razvlechenie");
        Televizor.Off();
        Technik PC = new HomeAppliences("Macbook", "Apple", 800, true, "info");
        Technik xolodilnic = new Fridge("Xolod", "ATLANT", 1500, true, "Moroz", "Xranenie");
        Technik Chainic = new Fridge("Tea", "BOSH", 500, false, "Prigotovlenie", "kipyatok");
        System.out.println(Televizor);
        System.out.println(PC);
        System.out.println(xolodilnic);
        System.out.println(Chainic);
    }
}




