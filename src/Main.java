import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Мария", "Хрис мун кун фун", 27));
        people.add(new Person("Дарья", "Миклухо-Маклай", 26));
        people.add(new Person("Елизавета", "Ван дер Сар", 27));
        people.add(new Person("Аня", "Ван Бюррен мап", 28));
        people.add(new Person("Семён", "Афанасьев", 25));
        people.add(new Person("Юлечка", "Горбань", 27));

        Collections.sort(people, new PersonNameComporator(3));
        System.out.println(people);
    }
}
