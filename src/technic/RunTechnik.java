package technic;


public class RunTechnik {

    public static void main(String[] args) {
        Technik Televizor = new HomeAppliences("TV", Brand.LG, 1000, false, "razvlechenie");
        Televizor.Off();
        Technik PC = new HomeAppliences("Macbook", Brand.APLLE, 800, true, "info");
        Technik xolodilnic = new Fridge("Xolod", Brand.ATLANT, 1500, true, "Moroz", "Xranenie");
        Technik Chainic = new Fridge("Tea", Brand.BOSH, 500, false, "Prigotovlenie", "kipyatok");
        System.out.println(Televizor);
        System.out.println(PC);
        System.out.println(xolodilnic);
        System.out.println(Chainic);
    }
}




