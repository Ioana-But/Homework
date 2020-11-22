package mobilePhones;

import mobilePhones.Phone;
import mobilePhones.Samsung;
import mobilePhones.SamsungGalaxyS6;
import mobilePhones.Huawey;
import mobilePhones.HuaweyP40;

public class Main {

    public static void main(String... args) {

        Phone phone3 = new HuaweyP40("Huawey", "P40", 88, "Green", "Metal", "P40 - green", 2020, "4HR");
        System.out.println("Manufacturer: " + phone3.getManufacturer() + ", model: " + phone3.getModel() + ", battery life: " + phone3.getBatteryLife() +
                ", color: " + phone3.getColor() + ", material: " + phone3.getMaterial() + ", name: " + phone3.getName() + ", production year: " +
                Huawey.getProductionYear() + ", camera: " + HuaweyP40.getCamera());

        Phone phone2 = new HuaweyP40("Huawey", "P40", 88, "Blue", "Plastic", "P40 - new", 2019, "4HR");
        System.out.println("Manufacturer: " + phone2.getManufacturer() + ", model: " + phone2.getModel() + ", battery life: " + phone2.getBatteryLife() +
                ", color: " + phone2.getColor() + ", material: " + phone2.getMaterial() + ", name: " + phone2.getName() + ", production year: " +
                Huawey.getProductionYear() + ", camera: " + HuaweyP40.getCamera());

        Phone phone1 = new SamsungGalaxyS6("Samsung", "Galaxy S6", 90, "Black", "Plastic", 2020, "H1", "HR");
        System.out.println("Manufacturer: " + phone1.getManufacturer() + ", model: " + phone1.getModel() + ", battery life: " + phone1.getBatteryLife() +
                ", color: " + phone1.getColor() + ", material: " + phone1.getMaterial() + ", name: " + phone1.getName() + ", production year: " +
                Samsung.getProductionYear() + ", camera: " + SamsungGalaxyS6.getCamera());
        Phone phone = new SamsungGalaxyS6("Samsung", "Galaxy S6", 80, "White", "Metal", 2020, "H", "HR");
        System.out.println("Manufacturer: " + phone.getManufacturer() + ", model: " + phone.getModel() + ", battery life: " + phone.getBatteryLife() +
                ", color: " + phone.getColor() + ", material: " + phone.getMaterial() + ", name: " + phone.getName() + ", production year: " +
                Samsung.getProductionYear() + ", camera: " + SamsungGalaxyS6.getCamera());

        phone.addContact("1", "0770077007", "Barack", "Obama");
        phone.addContact("2", "0740740740", "Joe", "Biden");
        phone.listContacts();

        phone.sendMessage("0770077007", "Who won the elections? ");


        phone.call("0740740740");


    }


}
