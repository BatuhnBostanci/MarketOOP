package persons;

public class Person {
    public String name;
    public String surname;
    public int age;
    public String mailAdress;
    public String phoneNumber;

    public static Person createPerson(String name, String surname, int age, String mailAdress, String phoneNumber) {
        Person person = new Person();
        person.name = name;
        person.surname = surname;
        person.age = age;
        person.mailAdress = mailAdress;
        person.phoneNumber = phoneNumber;
        return person;
    }
}
