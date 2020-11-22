import java.util.ArrayList;
import java.util.List;

public class Hobby implements IAddress{

    private String hobbyName;
    private int frequency;


    public Hobby(String hobbyName, int frequency) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
    }

    public String getHobbyName() {
        return hobbyName;
    }
    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }
    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int age) {
        this.frequency = frequency;
    }


    @Override
    public void add(String city) {

    }

    @Override
    public List<Address> getAll() {
        return null;
    }
}
