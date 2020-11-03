package mobilePhones;

public class Phone implements PhonesBehavior{

    public String manufacturer;

    public String model;

    public int batteryLife;

    public String color;

    public String material;

    Phone(String manufacturer, String model, int batteryLife, String color, String material){
        this.manufacturer = manufacturer;
        this.model = model;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;

    };

    public void addContact() {

    }

    public void listContacts() {

    }

    public void sendMessage() {

    }

    public void listMessage() {

    }

    public void call() {

    }

    public void viewHistory() {

    }
}
