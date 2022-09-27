import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Мария", "Хрис мун кун фун", 27));
        people.add(new Person("Дарья", "Миклухо-Маклай", 26));
        people.add(new Person("Елизавета", "Ван дер Сар мапс", 25));
        people.add(new Person("Аня", "Ван Бюррен мап", 28));
        people.add(new Person("Семён", "Афанасьев", 25));
        people.add(new Person("Юлечка", "Горбань", 27));

        Comparator<Person> comparator1 = (o1, o2) ->{
            int nameLength = 5;
            if(nameLength == o1.nameLengthPerson){
                return Integer.compare(o2.age, o1.age);
            }else if (o1.nameLengthPerson == o2.nameLengthPerson) {
                return Integer.compare(o2.age, o1.age);
            }
            return Integer.compare(o2.nameLengthPerson, o1.nameLengthPerson);
        };

        Collections.sort(people, comparator1);
        System.out.println(people);
    }
}
