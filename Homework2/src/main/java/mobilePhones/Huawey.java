package mobilePhones;

public class Huawey extends Phone{

    private static int productionYear;

    public static int getProductionYear(){
        return productionYear;
    }
    public int setProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return productionYear;
    }


    Huawey(String manufacturer, String model, int batteryLife, String color, String material, String name, int productionYear) {
        super(manufacturer, model, batteryLife, color, material, name);
        this.productionYear = productionYear;
    }
}