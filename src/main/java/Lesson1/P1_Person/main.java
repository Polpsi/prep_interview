package Lesson1.P1_Person;

public class main {
    public static void main(String[] args) {

        Person person = (new PersonBuilder("Boris"))
                .middleName("Fedorovich")
                .lastName("Lektin")
                .age(35)
                .gender("Male")
                .phone("1234567")
                .country("Russia")
                .address("Smolensk, Kirova str, 48")
                .build();
    }
}
