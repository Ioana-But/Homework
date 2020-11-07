package mobilePhones;

public class Phone implements PhonesBehavior{

    private String manufacturer;

    private String model;

    private int batteryLife;

    private String color;

    private String material;

    private String name;

    public String getManufacturer(){
        return manufacturer;
    }
    public String setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return manufacturer;
    }

    public String getModel(){
        return model;
    }
    public String setModel(String model) {
        this.model = model;
        return model;
    }

    public int getBatteryLife(){
        return batteryLife;
    }
    public int setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
        return batteryLife;
    }

    public String getColor(){
        return color;
    }
    public String setColor(String color) {
        this.color = color;
        return color;
    }

    public String getMaterial(){
        return material;
    }
    public String setMaterial(String material) {
        this.material = material;
        return material;
    }

    public String getName(){
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }


    Phone(String manufacturer, String model, int batteryLife, String color, String material, String name){
        this.manufacturer = manufacturer;
        this.model = model;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.name = name;

    };
    public void addContact(String position, String phoneNumber, String contactName, String contactSurname) {
        System.out.println(position +" " + phoneNumber +" " + contactName +" " + contactSurname);
    }

    public void listContacts() {

    }

    public String sendMessage(String phoneNumber, String messageContent) {
        batteryLife = batteryLife - 1;
        System.out.println("Remaining battery life:"+ batteryLife);
        if (messageContent.length() > 500) {
            final String s = "Message is too long. 500 characters max";
            return s;
        } else {System.out.println(phoneNumber +" Message: " + messageContent);}
        return phoneNumber;
    }

    public void listMessages() {

    }

    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
        batteryLife = batteryLife - 2;
        System.out.println("Remaining battery life:"+ batteryLife);

    }

    public void viewHistory() {

    }
}
