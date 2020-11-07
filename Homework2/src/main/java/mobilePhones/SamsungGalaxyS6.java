package mobilePhones;

public class SamsungGalaxyS6 extends Samsung{

    private static String camera;

    public static String getCamera(){
        return camera;
    }
    public String setCamera(String camera) {
        this.camera = camera;
        return camera;
    }

    SamsungGalaxyS6(String manufacturer,
                    String model,
                    int batteryLife,
                    String color,
                    String material,
                    int productionYear,
                    String name,
                    String camera) {
        super(manufacturer, model, batteryLife, color, material, name, productionYear);
        this.camera = camera;


    }


     }

