package catalog;

public enum SportType {

    VOLLEYBALL("Volleyball", Boolean.TRUE),
    TENNIS("Tennis", Boolean.FALSE),
    CHESS("Chess", Boolean.FALSE),
    SWIMMING("Swimming", Boolean.FALSE),
    FOOTBALL("Football", Boolean.TRUE);

    private final String name;
    private final Boolean teamSport;

    SportType(String name, Boolean teamSport) {
        this.name = name;
        this.teamSport = teamSport;
    }

}
