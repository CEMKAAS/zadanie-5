import java.util.Comparator;

public class PersonNameComporator implements Comparator<Person> {

    private int nameLength;

    public PersonNameComporator (int nameLength){
        this.nameLength = nameLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return nameLength >= o1.nameLength1 ? Integer.compare(o2.surname.length(), o1.surname.length()) : Integer.compare(o2.age, o1.age);
    }
}
