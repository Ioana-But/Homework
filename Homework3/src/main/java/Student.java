public class Student extends Person{

    boolean libraryPass;

    public Student(String name, int age, boolean libraryPass) {
        super(name, age);
        this.libraryPass = libraryPass;
    }
}
