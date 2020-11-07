package mobilePhones;

public interface PhonesBehavior {

    void addContact(String position, String phoneNumber, String name, String surname);

    void listContacts();

    String sendMessage(String phoneNumber, String messageContent);

    void listMessages();

    void call(String phoneNumber);

    void viewHistory();

}
