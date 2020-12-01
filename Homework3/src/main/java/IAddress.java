import java.util.List;

public interface IAddress {

    void add(String city, int streetNumber, Enum<Country> countryEnum);

    List<Address> getAll();
}
