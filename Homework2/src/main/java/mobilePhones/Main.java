package mobilePhones;

import mobilePhones.Phone;
import mobilePhones.Samsung;
import mobilePhones.SamsungGalaxyS6;

public class Main {

         public static void main(String... args){

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
