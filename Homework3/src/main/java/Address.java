import java.util.List;

public class Address implements IAddress{

    private String city;
    private int streetNumber;
    private Country country;

    public Address(String city, int streetNumber, Country country) {
        this.city = city;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public void add(String city, int streetNumber, Enum<Country> countryEnum) {

    }

    @Override
    public List<Address> getAll() {
        return null;
    }
}
