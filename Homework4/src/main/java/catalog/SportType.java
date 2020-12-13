package catalog;

public enum SportType {

    VOLLEYBALL("Volleyball", 'Y'),
    TENNIS("Tennis", 'N'),
    CHESS("Chess", 'N'),
    SWIMMING("Swimming", 'N'),
    FOOTBALL("Football", 'Y');

    private final String name;
    private final char teamSport;

    SportType(String name, char teamSport) {
        this.name = name;
        this.teamSport = teamSport;
    }

}
