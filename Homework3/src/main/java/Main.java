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

        List<Address> hobbyAddress1 = new ArrayList<>();

        List<Hobby> hobbyList1 = new ArrayList<>();

        Map<Person, List<Hobby>> personsHobbyMap = new HashMap<>();

        //person1 hobby address and hobby list
        hobbyAddress1.add(new Address("Wien", 23, Country.AT));
        hobbyList1.add(new Hobby("Skying", 2));
        personsHobbyMap.put(person1,hobbyList1);

        //person2
        List<Address> hobbyAddress2 = new ArrayList<>();
        List<Hobby> hobbyList2 = new ArrayList<>();
        hobbyAddress2.add(new Address("Rome", 158, Country.IT));
        hobbyList2.add(new Hobby("Fashion shows", 3));
        personsHobbyMap.put(person2,hobbyList2);


        //person3
        List<Address> hobbyAddress3 = new ArrayList<>();
        List<Hobby> hobbyList3 = new ArrayList<>();
        hobbyAddress3.add(new Address("Amsterdam", 337, Country.NL));
        hobbyList3.add(new Hobby("Traveling", 2));
        personsHobbyMap.put(person3,hobbyList3);


        //person4
        List<Address> hobbyAddress4 = new ArrayList<>();
        List<Hobby> hobbyList4 = new ArrayList<>();
        hobbyAddress4.add(new Address("Valencia", 74, Country.ES));
        hobbyList4.add(new Hobby("Gastronomy", 5));
        personsHobbyMap.put(person4,hobbyList4);

        personsHobbyMap.forEach((key, value) -> System.out.println("Person " + key + " Hobbies: " + Arrays.toString(value.toArray())));


    }


}