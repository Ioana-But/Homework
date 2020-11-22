import java.util.*;

public class Main {

    public static void main(String... args) {

        Person person1 = new Person("Joe", 50);
        Person person2 = new Person("Karl", 25);
        Person person3 = new Person("Mike", 47);
        Person person4 = new Person("Alex", 36);

        System.out.println("Persons ordered by name:");

        Set<Person> nameComp = new TreeSet<Person>(new NameComp());
        nameComp.add(person1);
        nameComp.add(person2);
        nameComp.add(person3);
        nameComp.add(person4);
        for (Person e : nameComp) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Persons ordered by their age");

        Set<Person> ageComp = new TreeSet<Person>(new AgeComp());

        ageComp.add(person1);
        ageComp.add(person2);
        ageComp.add(person3);
        ageComp.add(person4);

        for (Person e : ageComp) {
            System.out.println(e);
        }

    }

    List<address> hobbyAddress = new ArrayList<>();
        hobbyAddress.add("Park");
        hobbyAddress.add("Court");
        hobbyAddress.add("Stadium");
        hobbyAddress.add("Gym");

    Map<Person, List<Hobby>> personsHobbyMap = new HashMap<>();
      personsHobbyMap.put(person1, hobbyList1);
      personsHobbyMap.put(person2, hobbyList2);
      personsHobbyMap.put(person3, hobbyList3);
      personsHobbyMap.put(person4, hobbyList4);
}