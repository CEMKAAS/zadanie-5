import java.util.Comparator;

public class PersonNameComporator implements Comparator<Person> {

    private int nameLength;

    public PersonNameComporator (int nameLength){
        this.nameLength = nameLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if(nameLength == o1.nameLengthPerson){
            return Integer.compare(o2.age, o1.age);
        }else if (o1.nameLengthPerson == o2.nameLengthPerson) {
            return Integer.compare(o2.age, o1.age);
        }
        return Integer.compare(o2.nameLengthPerson, o1.nameLengthPerson);
    }
}
