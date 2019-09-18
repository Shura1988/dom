/*Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.*/

package Technic;
 public abstract class Technik {
     private String name;
     private String brand;
     private int  power;
     private boolean On;

     //конструктор
     Technik(String name, String brand, int power, boolean On) {
         this.name = name;
         this.brand = brand;
         this.power = power;
         this.On = On;
     }

     public void OnOf(boolean On) {
         System.out.println("Устройство  " + name + " Брэнд " + brand + " Его мощность " + power + "Включено" + On);


     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getBrand() {
         return brand;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }

     public int getPower() {
         return power;
     }

     public void setPower(int power) {
         this.power = power;
     }

     public boolean isOn() {
         return On;
     }

     public void setOn(boolean on) {
         On = on;
     }
 }



