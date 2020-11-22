public enum Country {

    ES("Spain"),
    AT("Austria"),
    NL("Netherlands"),
    FR("France"),
    RO("Romania"),
    IT("Italy");

    private final String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
