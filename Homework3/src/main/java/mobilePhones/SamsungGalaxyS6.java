package mobilePhones;

 class SamsungGalaxy extends Samsung{

     private String camera;

     SamsungGalaxy(String manufacturer, String model, int batteryLife, String color, String material, int productionYear, String camera) {
        super(manufacturer, model, batteryLife, color, material, productionYear);
         this.camera = camera;
     }
}
