package mobilePhones;

public class HuaweyP40 extends Huawey{

    private static String camera;


    public static String getCamera(){
        return camera;
    }
    public String setCamera(String camera) {
        this.camera = camera;
        return camera;
    }


    HuaweyP40(String manufacturer, String model, int batteryLife, String color, String material, String name, int productionYear, String camera) {
        super(manufacturer, model, batteryLife, color, material, name, productionYear);
    }
}

