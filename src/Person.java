public class Person {
    protected String name;
    protected String surname;
    protected int age;

    protected  int nameLength1;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age=age;
        nameLength1 = surname.length();
    }

    public String getName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return surname + " " + age;
    }


}
