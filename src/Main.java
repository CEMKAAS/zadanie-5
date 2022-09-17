import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Дарья", "Пахомова", 26));
        people.add(new Person("Елизавета", "Воробьёва", 26));
        people.add(new Person("Аня", "Угнивенко", 23));
        people.add(new Person("Семён", "Афанасьев", 25));
        people.add(new Person("Юлечка", "Горбань", 27));
        people.add(new Person("Вероника", "Журавлева", 29));

        Collections.sort(people, new PersonNameComporator(8));
        System.out.println(people);
    }
}