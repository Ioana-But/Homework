public interface IAddress {

    void add(String city, Enum<Country>);

    List<Address> getAll();
}
