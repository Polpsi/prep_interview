package Lesson1.P1_Person;

public class PersonBuilder {


    private final Person person;

    public PersonBuilder(String firstName) {
        person = new Person(firstName);
    }

    public PersonBuilder middleName(String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public PersonBuilder country(String country) {
        person.setLastName(country);
        return this;
    }

    public PersonBuilder address(String address) {
        person.setAddress(address);
        return this;
    }

    public PersonBuilder phone(String phone) {
        person.setPhone(phone);
        return this;
    }

    public PersonBuilder age(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder gender(String gender) {
        person.setGender(gender);
        return this;
    }

    public Person build() {
        return person;
    }
}