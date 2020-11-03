package mobilePhones;

public class Main extends Phone {

    String message;

    Main(String manufacturer, String model, int batteryLife, String color, String material) {
        super(manufacturer, model, batteryLife, color, material);
    }

    public static void main(String... args){

        Phone samsungS10 = new Phone("Samsung","S10", 48, "Blue", "Plastic");

        Phone samsungS11 = new Phone("Samsung","S11", 72, "White", "Metal");

        Phone huaweyP30 = new Phone("Huawey","P30", 60, "Green", "Plastic");

        Phone huaweyP40 = new Phone("Huawey","P40", 80, "Black", "Titanium");


        }


}
